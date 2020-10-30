package objectCalculatorServerClient;
import java.io.*;
import java.net.*;

public class ObjectCalculatorClient {         
    
	   public static void main(String[] args) {      
	      if(args.length != 1){   
	         System.out.println("���� : java ObjectCalculatorClient ip");
	         System.exit(0);
	      }   
	      Socket sock = null;   
	      ObjectOutputStream oos = null;   
	      ObjectInputStream ois = null;   
	      try{   
	         sock = new Socket(args[0], 10005);
	         
	         oos = new ObjectOutputStream(sock.getOutputStream());      
	         ois = new ObjectInputStream(sock.getInputStream());      
	         BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));      
	         String line = null;      
	         while(true){      
	            System.out.println("ù��° ���ڸ� �Է��Ͽ� �ּ���.(�߸� �Էµ� ���ڴ� 0���� ó���մϴ�.)");   
	            line = keyboard.readLine();   
	            int op1 = 0;   
	            try{   
	               op1 = Integer.parseInt(line);
	            }catch(NumberFormatException nfe){   
	               op1 = 0;
	            }   
	            System.out.println("�ι�° ���ڸ� �Է��Ͽ� �ּ���. (�߸� �Էµ� ���ڴ� 0���� ó���մϴ�.)");   
	            line = keyboard.readLine();   
	            int op2 = 0;   
	            try{   
	               op2 = Integer.parseInt(line);
	            }catch(NumberFormatException nfe){   
	               op2 = 0;
	            }   
	            System.out.println("+, -, *, / �߿� �ϳ��� �Է��Ͽ� �ּ���. ( �߸��Է��ϸ� + �� ó���մϴ�.)");   
	            line = keyboard.readLine();   
	            String opcode = "+";   
	            if(line.equals("+") || line.equals("-") || line.equals("*") || line.equals("/"))   
	               opcode = line;
	            else   
	               opcode = "+";
	            SendData s = new SendData(op1, op2, opcode);   
	            oos.writeObject(s);   
	            oos.flush();   
	            String msg = (String)ois.readObject();   
	            System.out.println(msg);
	            System.out.println("��� ����Ͻðڽ��ϱ�?(Y/n)");
	            line = keyboard.readLine();
	            if(line.equals("n")) break;
	            System.out.println("�ٽ� ����� �����մϴ�.");
	         } // while   
	         System.out.println("���α׷��� �����մϴ�.");   
	      }catch(Exception ex){      
	         System.out.println(ex);   
	      }finally{      
	         try{   
	            if(oos != null) oos.close();
	         }catch(Exception ex){}   
	         try{   
	            if(ois != null) ois.close();
	         }catch(Exception ex){}   
	         try{   
	            if(sock != null) sock.close();
	         }catch(Exception ex){}   
	      } // finally      
	   } // main         
	}            