package chtr3.exam01;

public class Annoymous {
	Person field = new Person() {
		void work () {
			System.out.println("����մϴ�.");
		}
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};
	
	void method1( ) {
		Person localSum = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}
			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		localSum.wake();
	}
	void method2(Person person) {
		person.wake();
       }
     }
