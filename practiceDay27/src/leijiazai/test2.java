package leijiazai;
//���ڼ̳й�ϵʱ�� ��ִ�и��ྲ̬��Ա ��ִ�����ྲ̬��Ա �ٰ�˳����ϵ���ִ�з� ��̬�߳�Ա
class Parent {   
    // ��̬���� 
  
    public static String p_StaticField = "����--��̬����";
  
    // ���� 
  
    public String p_Field = "����--����";   
  
    // ��̬��ʼ���� 
  
    static {   
        System.out.println(p_StaticField);   
        System.out.println("����--��̬��ʼ����");   
    }   
  
    // ��ʼ���� 
  
    {   
        System.out.println(p_Field);   
        System.out.println("����--��ʼ����");   
    }   
  
    // ������ 
  
    public Parent() {   
        System.out.println("����--������");   
    }   
}   
  
public class test2 extends Parent {
  
    // ��̬���� 
  
    public static String s_StaticField = "����--��̬����";
  
    // ���� 
  
    public String s_Field = "����--����";   
    // ��̬��ʼ���� 
  
    static {   
        System.out.println(s_StaticField);   
        System.out.println("����--��̬��ʼ����");   
    }   
    // ��ʼ���� 
  
    {   
        System.out.println(s_Field);   
        System.out.println("����--��ʼ����");   
    }   
  
    // ������ 
  
    public test2() {   
        System.out.println("����--������");   
    }   
  
    // ������� 
  
    public static void main(String[] args) {
  
        new test2();   
    }   
}  