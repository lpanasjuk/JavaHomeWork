package com.pb.panasjuk.hw10;

public class NumBox <T extends Number> {
    private final T[] numbers;


//конструктор принимающий параметр - максимальную длину массива.
    public NumBox(int size) {
       // numbers = new T[size];
        numbers = (T[]) new Number[size];

    }

//метод void add(T num) добавляющий число в массив. В случае если массив полон - выбросить исключение.
  /*  public void add(T num) {
    }


    void add(T t) throws Exception {
        if(this.filled >= this.numbers.length){
            throw new Exception("Array already filled!");
        }
        this.numbers[this.filled] = t;
        this.filled++;
    }
    */
public void add(int index, T num) throws ArrayIndexOutOfBoundsException {
    if(index > numbers.length) { throw new ArrayIndexOutOfBoundsException();
    } else numbers[index] = num;


//метод T get(int index) возвращающий число по индексу.
    public T get(int index) {
        return numbers[index];
    }


//- метод int length() возвращает текущее количество элементов.


//- метод double average() - подсчет среднего арифметического среди элементов массива.


//- метод double sum() - сумма всех элементов массива.
/*    public double sum() {
        double sum = 0.0;
        for (T i : numbers) {
            if (i == null) {
                sum+=0;
            } else sum+=i.doubleValue();
        }
        return sum;
    }
*/
public double sum() {
    double sum = 0;
    for (T i : numbers) {
        sum += i.doubleValue();
    }
    return sum;
}


//метод T max() - максимальный элемент массива.
    public T max() {
        T maxValue = arr.get(0);
        for (int i = 0; i < arr.size; i++) {
            if (arr.get(i).doubleValue() > maxValue.doubleValue())
                maxValue = arr.get(i);
        }
        return maxValue;
    }


}
