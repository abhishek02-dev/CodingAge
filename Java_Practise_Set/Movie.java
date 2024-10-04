package Java_Practise_Set;

import java.util.Scanner;

public class Movie {
String title;
String genre;
int duration;
double rating;
void watchMovie(){
    System.out.println("The movie is being watched.");
}
void rateMovie(double newRating){
rating= newRating;
    System.out.println("This movie rates "+rating);
}
void printMovieDetails(){
    System.out.println("Movie details:");
    System.out.println("Movie Title : "+title);
    System.out.println("Movie Genre :"+genre);
    System.out.println("Time duration of this movie is "+duration);
    System.out.println("This movie rates "+rating);
}

    public static void main(String[] args) {
    Movie m=new Movie();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title name :");
        m.title=sc.nextLine();
        System.out.println("Enter Movie Genre :");
        m.genre=sc.nextLine();
        System.out.println("Enter duration(in min) :");
        m.duration=sc.nextInt();
        System.out.println("Rate Movie :");
        m.rating=sc.nextDouble();
        m.printMovieDetails();
        System.out.println("Enter new rates :");
        double newRate=sc.nextDouble();
        m.watchMovie();
        m.rateMovie(newRate);
        m.printMovieDetails();
    }
}
