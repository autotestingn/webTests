package utils;

import io.qameta.allure.Step;

public class Util {

    @Step("Генерируем число от 0 до {max}")
    public static int rnd(int max)
    {
        return (int) (Math.random() * ++max);
    }
}
