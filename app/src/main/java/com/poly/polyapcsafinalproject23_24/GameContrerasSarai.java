package com.poly.polyapcsafinalproject23_24;

import java.util.Scanner;

public class GameContrerasSarai extends GameActivity{

    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    //private Player player; (optional)


    public void run()
    {
        //initialize number of lives
        numLives = 5;
        //create a scanner object for user input
        scan = new Scanner(System.in);

        //create a player object (optional)
        //player = new Player(...)


        //display project title and description
        Util.clearConsole();
        System.out.println(TextColor.PURPLE + "VISIT TO ANIMAL SAFARI" + TextColor.RESET);
        System.out.println("While visiting the safari you will be met with different situations. Hopefully you make the right choices to make this visit fun!!");

        Util.pauseConsole();
        start();
    }

    private void start()
    {
        //start adventure here
        System.out.println("\nNow that you've entered the safari, you are introduced with your tour group. You are supposed to stay with them at all time during the visit. The guide lady asks - What animal section would you like to visit first?");
        System.out.println("1. Lions\n2. Elephants\n3. Giraffes");
        int choice = Util.enterInt(1,3);

        if (choice == 1)
        {
            goToLions();
        }
        else if (choice == 2)
        {
            goToElephants();
        }
        else if (choice == 3)
        {
            goToGiraffes();
        }
    }

    //LIONS!!!
    private void goToLions()
    {
        Util.clearConsole();
        System.out.println("\nYou chose the lions, you see a cute family laying by the water so you decide to take a picture with the cool lions!");
        System.out.println("1. Just take a picture from a safe distance\n2. Go a litle closer for a much better angle");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            safePhoto();
        }
        else if (choice == 2)
        {
            riskyPhoto();
        }
    }

    private void safePhoto()
    {
        Util.clearConsole();
        System.out.println("\nYou decide to just stay away, not wanting to risk it. Now how would you like this picture?");
        System.out.println("1. Take a selfie with them?\n2. Just a picture of the lions by themselves");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            lionSelfie();
        }
        else if (choice == 2)
        {
            lionsPic();
        }
    }

    private void riskyPhoto()
    {
        Util.clearConsole();
        System.out.println("\nYou are now closer to the lions :o what would you decide?");
        System.out.println("1. Take a closer and cooler selfie with the lions\n2. Change your mind and decide to just observe?");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            betterSelfie();
        }
        else if (choice == 2)
        {
            observeLions();
        }
    }

    private void lionSelfie()
    {
        Util.clearConsole();
        System.out.println("While trying to take the picture the bystanders around start walking by blocking your picture and makinf the lions walk away. Tough luck");
        Util.pauseConsole();
        defeat();
    }

    private void lionsPic()
    {
        Util.clearConsole();
        System.out.println("...Kind of a boring picture, I mean it would have been much cooler if you posted a selfie with lions. Boringgg Yawnnn!");
        String text = """
      @@///////////@@@@@@@@@@@@@@
      @@@@@@@@@@/////////////////////@@@@@@@@@
      @@@@@@@@/////////////////////////@@@@@@@
      @@@@@@///////@@@@@@@@@@//@@@@//////@@@@@
      @@@@@///////@@@@@@@@@@@/(@@@@@//////@@@@
      @@@@@///////@@@@@@@@@@@/(@@@@@//////@@@@
      @@@@///////@@@@@@@@@@@@/(@@@@@//////&@@@
      @@@@@//////@@@@@@@@@@@@//@@@@@//////@@@@
      @@@@@///////////@@@@@///////////////@@@@
      @@@@@@//////////@@@////////////////@@@@@
      @@@@@@@@/////////@(//////////////@@@@@@@
      @@@@@@@@@@(///////////////////@@@@@@@@@@
      @@@@@@@@@@@@@@@///////////
      """;
        System.out.println(text);
        Util.pauseConsole();
        defeat();
    }
    private void betterSelfie()
    {
        Util.clearConsole();
        System.out.println("Wow! Such a good picture! You'll definetly get a lot of likes. But obviously something had to happen");
        System.out.println(TextColor.RED + "dun dun dun!!" + TextColor.RESET);
        System.out.println("After you take your amazing picture, one of the lions unexpectedly roars making you jump and drop your phone in the process... so clumsy. But most importantly, what are you going to do?");
        System.out.println("1. Go get your phone duh!\n2. Just leave it there");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            rescuePhone();
        }
        else if (choice == 2)
        {
            abandonPhone();
        }
    }

    private void observeLions()
    {
        Util.clearConsole();
        System.out.println("You decide to observe the lions but one seems to make straight eye contact with you... so nervous you don't think of looking away making it jump and launch at you. Rip!");
        String text = """
      %@%
         @@@@@@@@@@@@@@@@@@
                 &@@@@@@@@@@      @
                    @@@@@@@@@@  %@@@
      @@@@@@                          @@@@@@@@@@@@&@@@@@@@
      @@@@&@@@@@@@@@   @(                   @@@@@@@@@@@@@@@@@
      @@@@@@@ @@@@%                   @@@@@@@@@@@@@@@@@@@@@@@@,
      @@@@@@@@@@@@@@@@@@@(            @@@@@@@@@@@@@@@@@@@@@@@@@@@@
      @@@@@@@@@@@@@@@@@@@@          @@@@@@@@@@@@@@@@@@@@@@@@@@@@@.
      &@@@@@@@@@@@@@ #@,@@@            @@@@@@@@@@@@#@@@@  @@@@@@@@
      @  @/            @@           @.   @@      @&         @@@@
                                                    @@
                                                     @
      &@@@@@@@@@@@@%
      @@@@@@@@@@@@@@@@@@@@@@@@                   @@@@
      @@@@@@@@(@@@@@@@@@@@@@@@@@@@@@@@               @@@@ @#
      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@              @@@@@,
      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#             @@@@@@@@@@
      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@& @@@%                 /.@#
      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&@@@@@@@@@@@@
      ,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
      @@@@@@@@&        @@@@@   &@@@@@,        @@@@@@@@
      @@@@@@@@*   @@    @@@@   &@@@@@    @@/   @@@@@@@
      @@@@@@@@         @@@@@   &@@@@@    @@    @@@@@@@
      @@@@@@@@        @@@@@@   &@@@@@        @@@@@@@@@
      @@@@@@@@    @    @@@@@   &@@@@@   (@@@@@@@@@@@@@
      @@@@@@@@    @@    @@@%   &@@@@@   @@@@@@@@@@@@@@
      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
      ,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
      ,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
      ,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
      ,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
      """;
        System.out.println(text);
        Util.pauseConsole();
        defeat();
    }
    private void rescuePhone()
    {
        Util.clearConsole();
        System.out.println("You decide to go rescue your phone hopefully being saved from your mom's scolding. Thankfully the phone is not that close to the lions so how are you going to decide to approach the situation?");
        System.out.println("1. Make a run for it - be as quick as the flash\n2. Move slow and steady - like a ninja");
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            runToPhone();
        }
        else if (choice == 2)
        {
            slowToPhone();
        }
    }

    private void abandonPhone()
    {
        Util.clearConsole();
        System.out.println("Your group starts walking away and not wanting to be left behind you go follow them, leaving your phone with the dear lions and a big scolding from your mom when you get home");
        Util.pauseConsole();
        defeat();
    }

    private void runToPhone()
    {
        Util.clearConsole();
        System.out.println("You make a run for it making the lions go on mode alert to see what's the sudden movement, you don't even realize you are being chased until you feel a scratch on your leg... ouch!");
        Util.pauseConsole();
        defeat();
    }

    private void slowToPhone()
    {
        Util.clearConsole();
        System.out.println("You take the safe way and move slowly towards your phone, always keeping your eye on the pride of lions a few feet away. Once you use your ninja skills to grab the ohone and walk back slow and steady you make it back with your group safe and sound. Hooray!");
        System.out.println(TextColor.YELLOW + "Congrats you won!!" + TextColor.RESET);
        String text = """
      @@@@@@(  @@/@@
         &@@@@@@@@@@@@@@@@@@@
       #@@@@@@@@@@@@@@@@@@@@@@@@
       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
      *@@  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&
             /@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
              @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%  .@@@@@@@@@@@@@@@@.
               %@@@@@@@@@@@@@@@@@@@@@@,              /@@@@@@@@@@@@@@@@@
               @@@@@@@@  & @@    @@@@@                @@@@@@  @@@@@@@@  @@@##@@&
              @@@@@@             *@@@@@                @@@@@     @@@@@@
             @@@@@                @@@@@                 @@@@@       @@@@
            @@@@*                 @@@@@                 @@@@         @@@
          @@@@@                    @@@@                @@@@          /@@@
      &@@@@@@.                     @@@@@            @@@@@@             @@@
                                 (@@@@              (@             (@@@&
      """;
        System.out.println(text);
        System.out.println();
        System.out.println("Play Again??");
        Util.pauseConsole();
    }
    //ELEPHANTS!!!
    private void goToElephants()
    {
        Util.clearConsole();
        System.out.println("Your group decides to go visit the Elephants, how exciting! Your guide lets you know that you guys will be feeding the elephants and afterwards just observe while she gives fun facts. but she gives a warning... Will you remember it? Choose correctly");
        System.out.println("What do you choose first?\n1. Feed Elephants\n2. Observe the elephants");
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            feedElephants();
        }
        else if (choice == 2)
        {
            observeElephants();
        }
    }

    private void feedElephants()
    {
        Util.clearConsole();
        System.out.println("You decide to go feed the elephants so the guide gives you two types of food - choose wisely, remember elephants are biggg animals");
        System.out.println("1.Feed them peanuts\n2.Feed them lemon");
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            feedPeanuts();
        }
        else if (choice == 2)
        {
            feedLemons();
        }
    }

    private void feedPeanuts()
    {
        Util.clearConsole();
        System.out.println("You chose the correct answer congrats! You hold out the peanuts in your hand as the elephants slowly approaches you, he takes a sniff of it proceding to eat it with his trunk. You made the elephant happy and the guide congradulates you - Good Job!!");
        System.out.println(TextColor.BLUE + "You Win!!\nPlay Again?" + TextColor.RESET);
        String textTwo = """

                                      @@@@@@@@@@@@
            @@@@@@@@@@@@@@           @@@@@@@@@@@@@@@&
         @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.
         @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
         @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @
       .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @@@
        @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @@@@@@.
          .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @@@@@@@@&
          @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(
            @@@@@@@@@@@&@@@@@@@@@@@@@@@@@@@@@@@@@@  @@@@@@@@@@@@@@@
            &@@@@@@@@@%&@@@@@@@@@@@@@@@@ @@@@@@@@ @@@@@@@@@@@@@@@@@@                ,
              @@@@@@@% @@ &@@@@@@@@@@@ @@ @@@@@@ @@@@@@@@@@@@@@@@@@@@         ,@&@@@
                @@@@  @@  @.@@@@@@@@ @  @@ @@@ @@@@@@@@@@@@@@@@@@@@@@         @@@@%
                      @@@ @@ @@@@@@@ @ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@&      .@(
                     @@@@.@@@ @@@@@@@  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@*#%#*
                    @@@@@@@@@@ @@@@@@@.@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                   .@@@@@@@@@ . @@@@@@@@ @@@@@@@@@@@@@@@@@@@@@@@@@
                   @@@@@@@@@@     %@@@@@@ @@@@@@@@@@@@@@@@@@@@@@@
                  @@@@@@@@@@       @@@@@@@ @@@@@@@@@@@@@@@@@@@@@
                  @@@@@@@@@.       @@@@@@@@@@@@@@@@@@@@@@@@@@@,
                 &@@@@@@@@%        ,@@ @@@@@@ @@@@@@@@@@@@@@@        .
                 @@@@@@@@#       .  ( @@@@ @@  (@@@@@@@@@@@@
                 @@@@@@@&        &@@@@@@ @@@     @@@@@@@@@.
                @@@@@@@@            @@@@@@@@      @@@@@@@@
                @@@@@@@             /@@@@@@@       @@@@@@@
               /@@@@@@@              @@@@@@@      @@@@@@@@@
               @@@@@@@@              @@@@@@@@    @@@@@@@@@@@.
               @@@@@@@@@             ,@@@@@@@  @@@@@@@@@@@@@@
               @@@@@@@@@              @@@@@@@@ @@@@@@@@@@
              &@@@@@@@@@             @@@@@@@@@@@
      """;
        System.out.println(textTwo);
        Util.pauseConsole();
        start();
    }

    private void feedLemons()
    {
        Util.clearConsole();
        System.out.println("Wrong answer... The elephants takes the lemons in his trunks and after a few seconds he's running around the area like crazy, you move away being close to getting stomped. ELephants hate lemons! The guide gets you in trouble for not asking before feeding so now you're sad and the elephant is mad");
        defeat();
    }

    private void observeElephants()
    {
        Util.clearConsole();
        System.out.println("While standing and observing the amusing elephants you hear some people talking really loudly, actually more like screaming. Right when you turn around you see a monkey running at full speed with what seemed to be a purse in his hands. You see the poor stressed lady trying to get her purse back. What will you decide, be a hero or just act like you didn't see anything?");
        System.out.println("1. Chase the running monkey\n2. Just stay observing the animals");
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            chaseMonkey();
        }
        else if (choice == 2)
        {
            stayObserving();
        }
    }

    private void chaseMonkey()
    {
        Util.clearConsole();
        System.out.println("You choose to chase the thief of that monkey, once you catch up taking the purse back, the monkey continues running scared. You go back to give the lady her purse but then get framed of being apart of it accussing you of stealing her money. It will be a veryyy long day");
        defeat();
    }

    private void stayObserving()
    {
        Util.clearConsole();
        System.out.println("You zone out and lose the group you were with, they ae no where is sight, you wasted so much time you didn't realize they left to other animal sections. After what felt forever you find the group but get in trouble with the guide...");
        defeat();
    }

    //GIRAFFES!!!
    private void goToGiraffes()
    {
        Util.clearConsole();
        System.out.println("Your guide takes you to the giraffe section, you see the tall giraffes eating leaves, how cute! The guide offers two options: participate in a giraffe quiz or decide to pass. What will you choose");
        System.out.println("1. Participate in quiz\n2. Nah pass");
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            takeQuiz();
        }
        else if (choice == 2)
        {
            noQuiz();
        }
    }

    private void takeQuiz()
    {
        Util.clearConsole();
        System.out.println("You take the quiz, fun! Alright so there are two questions, which one do you want to take?");
        System.out.println("1. What color are giraffes' tongues?\n2. Average how many years do giraffes' live?");
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            giraffeTongue();
        }
        else if (choice == 2)
        {
            giraffeYears();
        }
    }

    private void giraffeTongue()
    {
        Util.clearConsole();
        System.out.println("You choose question number one: What color is a giraffe's tongue?\n1. Purple\n2.Pink");
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            purpleAnswer();
        }
        else if (choice == 2)
        {
            pinkAnswer();
        }
    }

    private void purpleAnswer()
    {
        Util.clearConsole();
        System.out.println("You are 100% correct, their tongues are a purple black-ish color due to their diet. Congrats You Win!!");
    }

    private void pinkAnswer()
    {
        Util.clearConsole();
        System.out.println("...Wrong, come on now this was an elementary school level question. You lose!");
        defeat();
    }

    private void giraffeYears()
    {
        Util.clearConsole();
        System.out.println("You choose question number two: In average how many years does a giraffe live?\n1. 40 years\n2.25 years");
        int choice = Util.enterInt(1,2);
        if (choice == 1)
        {
            fourtyYears();
        }
        else if (choice == 2)
        {
            twentyFiveYears();
        }
    }

    private void noQuiz()
    {
        Util.clearConsole();
        System.out.println("You have to be the most boring person alive. Booo tomato tomato");
        defeat();
    }

    private void fourtyYears()
    {
        Util.clearConsole();
        System.out.println("Wrong!! According to google usually giraffes live around 25 years. Good luck next time!\nPlay Again?");
        defeat();
    }

    private void twentyFiveYears()
    {
        Util.clearConsole();
        System.out.println("Correct!! According to google usually giraffes live around 25 years. Sadly not thattt long");
        System.out.println(TextColor.GREEN + "You win!\nPlay Again" + TextColor.RESET);
        String textThree= """

                                                               @ @#
                                                            &@ (@(@@@@
                                                             @@@@@@@@@
                                                            @@@@@@@@@@@
                                                          @@@@@@@@@@@@@@/
                                                        @@@@@@@@@@@@@@@@@@&
                                                       @@@@@@@@@@@@@@@@@@@@@@
                                                      @@@@@@@@@        @@@@@@@
                                                     @@@@@@@@@@
                                                     @@@@@@@@@@
                                                    @@@@@@@@@@@
                                                   @@@@@@@@@@@@
                                                  @@@@@@@@@@@@@
                                                 @@@@@@@@@@@@@@
                                                @@@@@@@@@@@@@@@
                                              @@@@@@@@@@@@@@@@@
                                            @@@@@@@@@@@@@@@@@@@
                                         ,@@@@@@@@@@@@@@@@@@@@#
                                       @@@@@@@@@@@@@@@@@@@@@@@
                                     @@@@@@@@@@@@@@@@@@@@@@@@
                                 @@@@@@@@@@@@@@@@@@@@@@@@@@@@
                          %@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
               @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
             @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#
          @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
          @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
          @ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  /@@@@@@@@@@@@
          @  @@@@@@@@@@@@@@@@                  ,@@@@@@@@@@@@*
          @  @@@@@@@@@@@@@@@@.                 /@@@@@@@@@@@@.
          @   @@@@@@@@@@@@@@@                  /@@@@@@@@@@@@@
          @   @@@@@@@@@@@@@@                    @@@@@( @@@@@@
          %   @@@@@@@@@@@@@%                   *@@@@@   @@@@@
          @@  @@@@@@@@@@@@@                    @@@@@@    @@@@@
          @@@@@@@@   @@@@@                     @@@@@.    #@@@@@
          @@@@@@    %@@@@                      @@@@@      @@@@@
          @@@@      @@@@@                      @@@#        @@@@
         @@@@@      (@@@@                      @@@          @@@@
         @@@@@        @@@                     .@@.           @@@
        .@@@@%         @@@                    @@@             @@@
        @@@@@/         .@@                    @@@             @@@/
       .@@@ @           @@@/                 @@@@              @@@
       @@@@ %            @@@&                @@@@              @@@@
       @@@@              ,@@@(                @@@@             @@@@@
         @@@@              @@@@%               /@@@@              @@@@
         @@@@@@             @@@@@/              @@@@@@            @@@@@@
      """;
        System.out.println(textThree);
        Util.pauseConsole();
    }

    //TO BE CONTINUED WITH CHANGES. PLEASE LIKE MY PROJECT MR BURKE!!!



    private void defeat()
    {
        numLives--;
        System.out.println("You sadly lost. If you are against animal abuse then -Play Again-... or get cancelled!!!");

        if (numLives > 0)
        {
            start();
        }
        else
        {
            System.out.println("You lose!! xO");
        }
    }