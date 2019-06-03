package lists;

import java.sql.SQLOutput;

public class MainLInkedLists {

    public static void main(String[] args){

//        System.out.println("--------------Simple Linked List----------------------");
//
//
//        SimpleLinkedList SLList = new SimpleLinkedList();
        SimpleLinkedList SLList1 = new SimpleLinkedList();
//
//
//        for(int i = 0; i < 10; i++){
//            SLList.insert(Math.round(Math.random()*100));
//        }
//
//        for(int i = 0; i < 5; i++){
//            SLList1.insert(Math.round(Math.random()*100));
//        }
//        long result;
//
//        SLList.display();
//        System.out.println("-------------deleting-----------------------");
//        for(int i = 0; i < 3; i++)
//            SLList.delete();
//
//        System.out.println(SLList.equals(SLList1));
//
//        System.out.println(SLList.hashCode());
//
//        System.out.println(SLList.isEmpty());


//        System.out.println("--------------Double Linked List----------------------");
//
//
        DoubleLinkedList dLList = new DoubleLinkedList();


        for(int i = 0; i < 20; i++){
            dLList.insertBegin(Math.round(Math.random()*100));
        }
//        System.out.println("---------------forward---------------------");
//
//        dLList.forward();
//
//        System.out.println("-------------------backward-----------------");
//
//        dLList.backward();
//
//        System.out.println(dLList.equals(SLList1));
//
//        System.out.println(dLList.hashCode());
//
//        System.out.println(dLList.isEmpty());
//
//        dLList.insertAfter(5, 25);
//        dLList.insertAfter(5, 30);
//        dLList.insertAfter(5, 456);
//        System.out.println("---------------forward after insert---------------------");
//        dLList.forward();

        ListIterator listIterator = dLList.getIterator();
        System.out.println("---------------forward---------------------");
        dLList.forward();
        listIterator.reset();
        System.out.println(listIterator.getCurrent().getData());
        listIterator.next();
        System.out.println(listIterator.getCurrent().getData());
        listIterator.next();
        System.out.println(listIterator.getCurrent().getData());
        listIterator.next();
        System.out.println(listIterator.getCurrent().getData());
        listIterator.back();
        System.out.println(listIterator.getCurrent().getData());
        listIterator.back();
        System.out.println(listIterator.getCurrent().getData());
        listIterator.insertAfter(5,6723);
        listIterator.insertAfter(7,6932);
        System.out.println("---------------forward---------------------");
        dLList.forward();
        listIterator.insertBefore(2,6555);
        listIterator.insertBefore(8,6222);
        dLList.forward();
        System.out.println(listIterator.deleteCurrent().getData());
        System.out.println(listIterator.deleteCurrent().getData());
        System.out.println(listIterator.deleteCurrent().getData());
        System.out.println(listIterator.deleteCurrent().getData());
        System.out.println("---------------forward---------------------");
        dLList.forward();






    }
}
