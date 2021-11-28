package com.pb.panasjuk.hw10;

public class NumBox <T extends Number> {
    private T[] numbers;


//конструктор принимающий параметр - максимальную длину массива.
    public NumBox(int size) {
        numbers = (T[]) new Number[size];  //создаем массив и задаем размер массива size и приводим к типу Т

    }


//метод get получить элемент из массива по индексу
    public T get(int index) {
        return numbers[index];
    }


//метод set положить элемент в массив, в массив будем ложить тип Т на какой-то оперделенный индекс
    public void set(int index, T number) {
        this.numbers[index] = number;
    }


//метод void add(T num) добавляющий число в массив. В случае если массив полон - выбросить исключение.
   public void add(int index, T num) throws ArrayIndexOutOfBoundsException {
       if (index > numbers.length) {
           throw new ArrayIndexOutOfBoundsException();
       } else numbers[index] = num;
   }

//- метод int length() возвращает текущее количество элементов.
       public int length() {
           int i = 0;
           for (T n : numbers) {
               if (n == null) {
                   break;
               }
               i++;
           }
           return i;
       }


//- метод double average() - подсчет среднего арифметического среди элементов массива.
    public double average(){
        double avеrage = (sum()/length());
        return avеrage;
    }

//- метод double sum() - сумма всех элементов массива.
  public double sum() {
    double sum = 0.0;
    for (T i : numbers) {
        sum += i.doubleValue();
    }
    return sum;
}


//метод T max() - максимальный элемент массива.
    public T max(){
        T maX = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i].doubleValue() > maX.doubleValue()) {
                maX = numbers[i];
            }
        }
        return maX;
    }

}


