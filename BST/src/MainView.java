import java.util.Scanner;

public class MainView {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        BST obj = new BST(); 
        System.out.println("Binary Search Tree Test");          
        char ch;
        do    
        {
            System.out.println("Binary Search Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. delete");
            System.out.println("3. search");
            System.out.println("4. count nodes");
            System.out.println("5. check empty"); 
 
            int ch1 = scan.nextInt();            
            switch (ch1)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                obj.insert( scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to delete");
                obj.delete( scan.nextInt() );                     
                break;                         
            case 3 : 
                System.out.println("Enter integer element to search");
                System.out.println("Search result : "+ obj.search( scan.nextInt() ));
                break;                                          
            case 4 : 
                System.out.println("Nodes = "+ obj.countNodes());
                break;     
            case 5 :  
                System.out.println("Empty status = "+ obj.isEmpty());
                break;            
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
             
            System.out.println("Post order : ");
            obj.postorder();
            System.out.println("Pre order : ");
            obj.preorder();
            System.out.println("In order : ");
            obj.inorder();
 
            System.out.println("\nDo you want to continue (y / n) ");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');               
    }
 
		
		
		

	

}
