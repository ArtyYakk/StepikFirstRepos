/*
public - видно всем
private - видно только в классе
protected - видно только в классе или пакете и в производных классах даже если они в других пакетах
default - видно всем классам в текущем пакете

геттеры сеттеры

static полям и методам совсем не нужны экземпляры
* Инициализатор им нужен тоже вида static{}, выполняется при создании первого объекта
* Переопределить статиеский метод НЕЛЬЗЯ

final можно инициализировать только ОДИН раз
нельзя переопределить final
final static по сути константа
класс final никак не унаследовать

abstract класс не подразумевает создания его объектов, предоставляет базовый функционал для классов-наследников
abstract метод подлежит реализации в классе-наследнике

class Book implements Printable, определяем ранее абстрактные методы
ВСЕ методы должны быть реализованы
класс реализовал НЕ ВСЕ методы -> он абстрактный  -> методы будут реализовать наследники
default - реализованные методы, их можно определить
есть статические и приватные (повторяющиеся внутри интерфейса действия) методы
class book implements readable, searchable - множественная реализация интерфейсов
interface BookPrintable extends Printable - наследование интерфейсов
можно определять внутри других классов и интерфейсов
могут быть использованы в качестве типа параметров или типа возвращаеммого значения



*/


public class FigureL {
    int a;
    int b;
    int c;

    {
        a = 0;
        b = 0;
        c = 0;
    }

    public FigureL(){}

    public FigureL(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void run(){}
    void sleep(){}

    void walk(){
        System.out.println("a = " + a + " b = " + b + " c = " + c);
    }
    void walk(int a, int b){
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        FigureL kvadro = new FigureL();
        kvadro.walk();
        Multiangle noie = new Multiangle(1,2,3);
        noie.walk();
    }
}

class Multiangle extends FigureL{

    public Multiangle(){
    }

    public Multiangle(int a, int b, int c){
        super(a,b,c);
    }

    public Multiangle(int a, int bub){
        super.a = a;
        this.a = bub;
        System.out.println(a);
    }
    @Override
    void walk(){
        super.walk();
        System.out.println("Override!");
    }
        }