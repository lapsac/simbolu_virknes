import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String date = sc.next();
    sc.close();
    String[] parts = date.split("\\.");// ("\\.") datumu pāršķeļ divās daļās
    int day = Integer.parseInt(parts[0]);//norāda, ka diena ir pirmajā daļā pirms punkta
    int month = Integer.parseInt(parts[1]);//norād, ka mēnesis ir otrā pusē punktam
    if(month==1 && day >=20 || month==2 && day<=20 ){
     System.out.println("ūdensvīrs"); 
    }
    else if(month==2 && day >=19 || month==3 && day<=20 ){
     System.out.println("zivis"); 
    }
    else if(month==3 && day >=21 || month==4 && day<=19 ){
     System.out.println("auns"); 
    }
    else if(month==4 && day >=20 || month==5 && day<=20 ){
     System.out.println("vērsis"); 
    }
    else if(month==5 && day >=21 || month==6 && day<=21 ){
     System.out.println("dvīni"); 
    }
    else if(month==6 && day >=22 || month==7 && day<=22 ){
     System.out.println("vēzis"); 
    }
    else if(month==7 && day >=23 || month==8 && day<=22 ){
     System.out.println("lauva"); 
    }
    else if(month==8 && day >=23 || month==9 && day<=22 ){
     System.out.println("jaunava"); 
    }
    else if(month==9 && day >=23 || month==10 && day<=22 ){
     System.out.println("svari"); 
    }
    else if(month==10 && day >=23 || month==11 && day<=22 ){
     System.out.println("skorpions"); 
    }
    else if(month==11 && day >=23 || month==12 && day<=21 ){
     System.out.println("strēlnieks"); 
    }
    else if(month==12 && day >=22 || month==1 && day<=19 ){
     System.out.println("mežāzis"); 
    }
  }
}
