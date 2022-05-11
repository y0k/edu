package ru.eduprof;

import ru.eduprof.Converter.CurrencyConverter;

//TODO #1 Разработайте интерфейс банкомата на Java. Работая над проектом, вы создадите пять классов:
// для владельца счета, самого счета, транзакции, банка и банкомата.
//После ввода идентификатора и пин-кода пользователи должны получить доступ к записям о каждой
//транзакции,а также получить  возможность класть деньги на депозит, снимать средства и делать переводы.
//TODO #2 Обменник используется для конвертации валют. Пользователь может ввести сумму в одной валюте
// и узнать, сколько это будет в другой. Валюту выбирает сам пользователь.
abstract class Atm implements CurrencyConverter {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public String toString() {
        return "Atm{}";
    }

    public Atm() {
    }
}
