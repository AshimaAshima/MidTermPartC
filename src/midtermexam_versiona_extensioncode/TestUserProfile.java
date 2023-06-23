/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class TestUserProfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = sc.nextLine();

        System.out.println("Choose your favorite genre:");
        displayGenres();
        int genreChoice = sc.nextInt();
        sc.nextLine(); 

        String[] genres = {"Action","Mystery","Drama","Comedy"};
        String favoriteGenre = genres[genreChoice - 1];

        UserProfile userProfile = new UserProfile(userName, favoriteGenre);

        System.out.println("User Profile Created Succesfully:");
        System.out.println("User ID: " + userProfile.getUserID());
        System.out.println("Favorite Genre: " + userProfile.getGenre());
    }

    /*
     * Possible Genres
     */
    private static void displayGenres() {
        String[] genres = {"Action","Mystery","Drama","Comedy"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + "." + genres[i]);
        }
    }
}

