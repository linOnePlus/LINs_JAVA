package leijiazai;
//��ʼ��˳�� ����̬��������̬��ʼ���飩>����������ʼ���飩>������
public class test1 {   
	  
    // ��̬���� 
  
    public static String staticField = "��̬����";
  
    // ���� 
  
    public String field = "����";   
  
    // ��̬��ʼ���� 

    static {   
        System.out.println(staticField);   
        System.out.println("��̬��ʼ����");   
    }   
  
    // ��ʼ���� 
  
    {   
        System.out.println(field);   
        System.out.println("��ʼ����");   
    }   
  
    // ������ 
  
    public test1() {   
        System.out.println("������");   
    }   
  
    public static void main(String[] args) {
  
        new test1();   
    }   
}  
