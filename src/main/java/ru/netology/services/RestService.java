package ru.netology.services;

public class RestService {

    /*public int calcRest(int income, int expenses) {
        int count = 1; // счётчик месяцев отдыха
        int money = 3000; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= expenses) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses;
            } else {
                money = money + income;
            }
        }
        return count;
    */
    public int calcRest(int income, int expenses, int threshold) {
        int money = 0; // изначально нет денег
        int restMonths = 0; // нет свободных месяцев отдыха

        for (int month = 1; month < 12; month++) { // вводим цикл расчета, от одного до 12 месяцев
            if (money >= threshold) { // если денег больше или равно минимального порога, тогда отдых и не работать
                money -= expenses; // то вычитаем обязательные траты
                money -= money / 3; // и уменьшаем траты в 3 раза
                restMonths++; // увеличиваем количество месяцев отдыха
            } else {
                money += income - expenses; // если денег не хватает то увеличиваем количество работы
            }

        }
        return restMonths;
    }
}




