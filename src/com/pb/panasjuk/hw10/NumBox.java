package com.pb.panasjuk.hw10;

public class NumBox <T extends Number> {
    private T[] numbers;


//конструктор принимающий параметр - максимальную длину массива.
    public NumBox(int size) {
       // numbers = new T[size];
        numbers = (T[]) new Number[size];  //создаем массив Number и задаем размер массива size и приводим к типу Т

    }


//метод get получить элемент из массива по индексу
    public T get(int index) {
        return numbers[index];
    }


//метод set положить элемент в массив, в массив будем ложить тип Т на какой то оперделенный индекс
    public void set(int index, T number) {
        this.numbers[index] = number;
    }




//метод void add(T num) добавляющий число в массив. В случае если массив полон - выбросить исключение.


    public void add(T number) throws Exception {
        if(this.number >= this.numbers.length){
            throw new Exception("Array already filled!");
        }
        this.numbers[this.number] = number;
        this.number++;
    }
  /*
public double add(int index, T num) throws ArrayIndexOutOfBoundsException {
    if(index > numbers.length) { throw new ArrayIndexOutOfBoundsException();
    } else numbers[index] = num;

*/

//метод T get(int index) возвращающий число по индексу.
    public T get(int index) {
        return numbers[index];
    }


//- метод int length() возвращает текущее количество элементов.
     public int length() {
        int i=0;
        for (T n: numbers) {
        if (n==null) {
            break;
        }
        i++;
        if (i==numbers.length) {
            System.out.println("Массив заполен");
            break;
        }
        }
     }

//- метод double average() - подсчет среднего арифметического среди элементов массива.
   /* public double average() {
        double average;
        double sum = 0;
        int i = 0;
        for (T n: numbers) {
            if (n != null) {
                Double nNew = (Double) n;
                double nNum = nNew.doubleValue();
                sum += nNum;
                i++;
            }
            else break;
        }
        average = sum / i;
        return average;  //подсчет среднего арифметического элементов массива
    }
*/

    public double average(){
        double avеrage = (sum()/length());
        return avеrage;
    }

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
  /*  public T max() {
        T maxValue = arr.get(0);
        for (int i = 0; i < arr.size; i++) {
            if (arr.get(i).doubleValue() > maxValue.doubleValue())
                maxValue = arr.get(i);
        }
        return maxValue;
    }
    */

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


