package chtr3.exam01;

public class AnnoymousExample {

	public static void main(String[] args) {
		Annoymous annoy = new Annoymous();
		//�͸� ��ü �ʵ� ���
		annoy.field.wake();
		//�͸� ��ü ���� ���� ���
		annoy.method1();
		//�͸� ��ü �Ű��� ���
		annoy.method2(
				new Person() {
				void study() {
					System.out.println("�����մϴ�.");
				}
			@Override
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				study();
			   }		
		      }
        	);
           } 
          }
