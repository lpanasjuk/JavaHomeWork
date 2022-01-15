package com.pb.panasjuk.hw14;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class ClientGUI extends JFrame {
    //создали поля кнопок, надписей, которые будут в нашей форме
    private JButton button = new JButton("Press"); //кнопка с названием нажать
    private JTextField input = new JTextField(""); //поле ввода
    private JLabel label = new JLabel("Input:"); //название поля ввода - надпись

    //конструктор, который будет вызываться при создании объекта данного класса
    public ClientGUI () {
        super("Интерфейс клиента"); //название нашей формы
        //делаем размер нашей формы
        this.setBounds(100, 100, 250, 100);
        //операция при которой форма будет закрываться
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //создадим контейнер - это наша форма, в которую можем помещать все наши кнопки, поля
        Container container = this.getContentPane();
        //ставим отступы в форме по горизонтали и по вертикали
        container.setLayout(new GridLayout(3, 2, 2, 2));
        //теперь помещаем в нашу форму наши кнопки, надписи
        container.add(label); //добавили в форму надпись
        container.add(input); //добавили в форму поле ввода
        //дальше кнопка, при её нажатии будет происходить какое-то действие
        button.addActionListener(new Client()); //addActionListener - позволяет вызвать класс в котором будет реализация нашего действия
        //добавим кнопку в нашу форму
        container.add(button);


    }
}
