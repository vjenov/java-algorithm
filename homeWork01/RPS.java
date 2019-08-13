package homeWork01;
import java.util.Scanner;
import java.util.Random;

class RPS{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        int side = 0;
        String com = new String();
       
        while(true) {
        side = ran.nextInt(3);
        switch(side) {
        	case 0 : com = "가위";
        	break;
        	case 1 : com = "바위";
        	break;
        	case 2 : com = "보";
        	break;
        }
        System.out.println("가위바위보 게임");
        System.out.println("1 : 가위, 2 : 바위, 3 : 보");
        String me = new String();
        int mine = 0;
        me = scan.nextLine();
        
        System.out.println("컴퓨터가 낸 것은 " + com);
        System.out.println("당신이 낸 것은 " + me);
        
        switch(me) {
    	case "가위 ":  mine = 0;
    	break;
    	case "바위" : mine =1;
    	break;
    	case "보" : mine = 2;
    	break;
        }
        if(side == 0) {
        	switch(mine) {
        	case 0 : System.out.println("Draw");
        	break;
        	case 1 : System.out.println("You Win");
        	break;
        	case 2 : System.out.println("You Lose");
        	break;
        	}
        }else if(side == 1) {
        	switch(mine) {
        	case 0 : System.out.println("You Lose");
        	break;
        	case 1 : System.out.println("Draw");
        	break;
        	case 2 : System.out.println("You Win");
        	break;
        	}
        }else if(side == 2) {
        	switch(mine) {
        	case 0 : System.out.println("You Win");
        	break;
        	case 1 : System.out.println("You Lose");
        	break;
        	case 2 : System.out.println("Draw");
        	break;
        	}
        }
    }
    } 
}
