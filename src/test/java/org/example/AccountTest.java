package org.example;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

    Account account1 = new Account("Юрий Панкрушин");
    Account account2 = new Account(" Юр ");
    Account account3 = new Account(" Юрий ПанкрушинПанкру ");
    Account account4 = new Account(" Юрий Панкрушин Панкрушин ");

    @Test
    @DisplayName("Проверка правильного имени")
    @Description("Проверить, что имя, не имеющее пробелы вначале и конце, состоящее из двух слов, разделенных одним пробелом, длиною от 3 до 19 символов включительно, возвращает True")
    public void checkThatCorrectNameReturnsTrue() {
        Assert.assertTrue(account1.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверка имени с длиной менее 3 символов")
    @Description("Проверить, что имя, состоящее из 2 символов, возвращает False")
    public void checkThatNameLessThan3SymbolsReturnsFalse() {
        Assert.assertFalse(account2.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверка имени с длиной более 19 символов")
    @Description("Проверить, что имя, состоящее из 20 символов, возвращает False")
    public void checkThatNameMoreThan19SymbolsReturnsFalse() {
        Assert.assertFalse(account3.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверка имени, содержащее более одного пробела между словами")
    @Description("Проверить, что имя, которое содержит более одного пробела между словами, возвращает False")
    public void checkThatNameWithMoreThanOneSpaceInsideReturnsFalse() {
        Assert.assertFalse(account4.checkNameToEmboss());
    }
}
