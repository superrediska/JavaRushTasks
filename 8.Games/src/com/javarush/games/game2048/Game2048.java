package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

public class Game2048 extends Game {
    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];
    private boolean isGameStopped = false;
    private int score = 0;

    public void initialize() {
        setScreenSize(SIDE, SIDE);
        setTurnTimer(10);
        createGame();
        drawScene();
    }

    private void createGame() {
        gameField = new int[SIDE][SIDE];

        createNewNumber();
        createNewNumber();

    }


    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.NONE, "ты проиграл!", Color.RED, 50);
    }

    private boolean canUserMove() {
        for (int[] row : gameField) {
            for (int value : row) {
                if (value == 0) {
                    return true;
                }
            }
        }
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {

                if (i + 1 < SIDE && gameField[i][j] == gameField[i + 1][j]) {
                    return true;
                }
                if (j + 1 < SIDE && gameField[i][j] == gameField[i][j + 1]) {
                    return true;
                }
            }
        }
        return false;
    }

    private void drawScene() {
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                setCellColoredNumber(i, j, gameField[j][i]);
            }
        }
    }

    private void win() {
        isGameStopped = true;
        showMessageDialog(Color.NONE, "ты выиграл!", Color.WHITE, 50);
    }

    private void createNewNumber() {
        int numberY;
        int numberX;
        boolean isCreate = false;

        if (getMaxTileValue() == 2048) {
            win();
        }
        do {
            numberY = getRandomNumber(0, SIDE);
            numberX = getRandomNumber(0, SIDE);
            if (gameField[numberX][numberY] == 0) {
                gameField[numberX][numberY] = getRandomNumber(10) < 9 ? 2 : 4;
                isCreate = true;
            }
        } while (!isCreate);


    }

    private void setCellColoredNumber(int x, int y, int value) {
        Color color = getColorByValue(value);
        String valueStr = value > 0 ? "" + value : "";
        setCellValueEx(x, y, color, valueStr);
    }

    private Color getColorByValue(int value) {
        switch (value) {
            case (0):
                return Color.SILVER;
            case (2):
                return Color.GREY;
            case (4):
                return Color.AQUA;
            case (8):
                return Color.AQUAMARINE;
            case (16):
                return Color.BLUEVIOLET;
            case (32):
                return Color.BEIGE;
            case (64):
                return Color.BISQUE;
            case (128):
                return Color.BLANCHEDALMOND;
            case (256):
                return Color.PINK;
            case (512):
                return Color.DEEPPINK;
            case (1024):
                return Color.RED;
            case (2048):
                return Color.DARKRED;
            default:
                return Color.NONE;
        }
    }

    private boolean compressRow(int[] row) {
        int position = 0;
        boolean result = false;
        for (int x = 0; x < SIDE; x++) {
            if (row[x] > 0) {
                if (x != position) {
                    row[position] = row[x];
                    row[x] = 0;
                    result = true;
                }
                position++;
            }
        }
        return result;
    }

    private boolean mergeRow(int[] row) {
        boolean status = false;
        for (int i = 0; i < row.length; i++) {
            if (row[i] != 0) {
                if (i + 1 < row.length && row[i] == row[i + 1]) {
                    row[i] = row[i] * 2;
                    row[i + 1] = 0;
                    status = true;
                    score += row[i];
                    setScore(score);
                }
            }
        }
        return status;
    }

    @Override
    public void onKeyPress(Key key) {
        if (isGameStopped) {
            if (key == Key.SPACE) {
                score = 0;
                setScore(score);
                isGameStopped = false;
                createGame();
                drawScene();
            } else {
                return;
            }
        }
        if (!canUserMove()) {
            gameOver();
            return;
        }
        if (key == Key.LEFT) {
            moveLeft();
            drawScene();
        } else if (key == Key.RIGHT) {
            moveRight();
            drawScene();
        } else if (key == Key.UP) {
            moveUp();
            drawScene();
        } else if (key == Key.DOWN) {
            moveDown();
            drawScene();
        }

    }

    private void moveLeft() {
        boolean isCreateNewNumber = false;
        for (int[] row : gameField) {

            boolean isCompressRow = compressRow(row);
            boolean isMergeRow = mergeRow(row);
            if (isMergeRow) {
                compressRow(row);
            }
            if (isCompressRow || isMergeRow) {
                isCreateNewNumber = true;
            }
        }
        if (isCreateNewNumber) {
            createNewNumber();
        }
    }

    private void moveRight() {
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
    }

    private void moveUp() {
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
    }

    private void moveDown() {
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
    }

    private void rotateClockwise() {
        int[][] gameField90 = new int[SIDE][SIDE];
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                gameField90[j][SIDE - i - 1] = gameField[i][j];
            }
        }
        gameField = gameField90;
    }

    private int getMaxTileValue() {
        int mx = 0;
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                if (gameField[i][j] > mx) {
                    mx = gameField[i][j];
                }
            }
        }
        return mx;
    }
}

