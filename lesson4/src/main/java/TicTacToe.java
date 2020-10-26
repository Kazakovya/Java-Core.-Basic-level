import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static final int SIZE = 3;
    public static final int ROWTOWIN = 3;
//  Для выбора размера поля измените значение переменной SIZE.
//  Для выбора длины ряда, необходимого для победы, измените значение переменной ROWTOWIN.

    public static final char EMPTY = '-';
    public static final char CROSS = 'X';
    public static final char ZERO = '0';
    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();

    public static void main(String[] args) {
        char[][] field = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = EMPTY;
            }
        }
        print(field);
        while (true) {
//          Ход пользователя
            System.out.println("Введи координаты крестика. Например, 1 2");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            int x = Integer.parseInt(parts[0]) - 1;
            int y = Integer.parseInt(parts[1]) - 1;
            if (x < 0 || y < 0 || x > SIZE || y > SIZE) {
                System.out.println("Координаты за пределами поля. Размер поля: " + SIZE + " x " + SIZE);
                continue;
            }
            if (field[x][y] != EMPTY) {
                System.out.println("Нельзя туда бить! Там уже " + field[x][y]);
                continue;
            }
            field[x][y] = CROSS;
            System.out.println("Ваш ход:");
            print(field);
            if (isWin(field, CROSS) == true) {
                System.out.println("Поздравляем! Победили крестики!");
                break;
            } else if (!hasEmptyCell(field)) {
                System.out.println("Ничья");
                break;
            }
//          Ход компьютера
            while (true) {
                int cx = random.nextInt(SIZE);
                int cy = random.nextInt(SIZE);
                if (field[cx][cy] != EMPTY) {
                    continue;
                }
                field[cx][cy] = ZERO;
                break;
            }
            System.out.println("Ход компьютера:");
            print(field);
            if (isWin(field, ZERO)) {
                System.out.println("Победили нолики! Не отчаивайтесь!");
                break;
            }
            if (!hasEmptyCell(field)) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    public static void print(char[][] field) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(field[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static boolean isWin(char[][] field, char player) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == player) {
                    int row = 1;
                    for (int k = 1; k < ROWTOWIN; k++) {
                        if (j + ROWTOWIN > SIZE) continue;
                        if (field[i][j + k] == player) {
                            row++;
                            if (row == ROWTOWIN) return true;
                        } else break;
                    }
                    row = 1;
                    for (int k = 1; k < ROWTOWIN; k++) {
                        if (i + ROWTOWIN > SIZE) continue;
                        if (field[i + k][j] == player) {
                            row++;
                            if (row == ROWTOWIN) return true;
                        } else break;
                    }
                    row = 1;
                    for (int k = 1; k < ROWTOWIN; k++) {
                        if (i + ROWTOWIN > SIZE || j + ROWTOWIN > SIZE) continue;
                        if (field[i + k][j + k] == player) {
                            row++;
                            if (row == ROWTOWIN) return true;
                        } else break;
                    }
                    for (int k = 1; k < ROWTOWIN; k++) {
                        if (i + ROWTOWIN > SIZE || j - ROWTOWIN + 1 < 0) continue;
                        if (field[i + k][j - k] == player) {
                            row++;
                            if (row == ROWTOWIN) return true;
                        } else break;
                    }
                }
            }
        }
        return false;
    }

    public static boolean hasEmptyCell(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == EMPTY) return true;
            }
        }
        return false;
    }
    }




