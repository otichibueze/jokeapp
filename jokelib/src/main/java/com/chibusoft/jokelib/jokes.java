package com.chibusoft.jokelib;

import java.util.Random;

public class jokes {

    Random random;

    String[] myJokes;

    public jokes()
    {
        myJokes = new String[50];

        myJokes[0] = "If women ruled the world there would be no wars. Just a bunch of jealous countries not talking to each other.";
        myJokes[1] = "I'm in shape... Unfortunately, it's the shape of a potato.";
        myJokes[2] = "I failed my driver's test today. The instructor asked me \"What do you do at a red light?\" I said \"I usually check my emails and see what people are up to on Facebook.\" ";
        myJokes[3] = "Old people at weddings always poke me and say \"you're next\". So I started doing the same thing to them at funerals.";
        myJokes[4] = "Running away doesn't help you with your problems... unless you're fat.";
        myJokes[5] = "Light travels faster than sound. This is why some people appear bright until you hear them speak.";
        myJokes[6] = "I'm so good at sleeping that I can do it with my eyes closed.";
        myJokes[7] = " Whatever you do, always give 100%. Unless you're donating blood";
        myJokes[8] = "I changed all my passwords to \"incorrect\", so that whenever I forget, it will tell me, \"Your password is incorrect.\"";
        myJokes[9] = "Chocolate comes from cocoa, which is a tree. That makes it a plant. Therefore, chocolate is salad.";
        myJokes[10] = "I always try to cheer myself up by singing when I get sad. Most of the time, it turns out that my voice is worse than my problems.\n";
        myJokes[11] = "Whose cruel idea was it for the word \"Lisp\" to have an \"S\" in it?";
        myJokes[12] = "People say love is the best feeling, but I think finding a toilet when you've got diarrhea is better.";
        myJokes[13] = "Going to McDonald's for a salad is like going to a prostitute for a hug. ";
        myJokes[14] = "Never let a fool kiss you, or a kiss fool you.";
        myJokes[15] = "Saw some footage of polar bears drinking water today. It's obviously fake, everybody knows they only drink Coca-Cola.";
        myJokes[16] = "Don't kid yourself would be a great slogan for a condom company.";
        myJokes[17] = "If you were home alone, and you heard a fart, would you be scared or laugh?";
        myJokes[18] = "Surprise sex is the best thing to wake up to...Unless you're in prison! ";
        myJokes[19] = " Always borrow money from a pessimist. He won't expect it back. ";
        myJokes[20] = "Scientists say the universe is made up of protons, neutrons and electrons. They forgot to mention morons.";
        myJokes[21] = "Q: How many programmers does it take to change a light bulb? \n" + "A: None. It's a hardware problem. ";
        myJokes[22] = "Q: Why do programmers always mix up Halloween and Christmas? \n" + "A: Because 31 OCT = 25 DEC. ";
        myJokes[23] = "Q: What does a proud computer call his little son? \n" + "A: A microchip off the old block. \n";
        myJokes[24] = "If at first you don't succeed, call it version 1.0 ";
        myJokes[25] = "Programming is like sex, one mistake and you have to support it for the rest of your life.";
        myJokes[26] = "I would love to change the world, but they won't give me the source code.";
        myJokes[27] = "CAPS LOCK – Preventing Login Since 1980.";
        myJokes[28] = "A computer once beat me at chess, but it was no match for me at kick boxing.";
        myJokes[29] = "Are you sitting on the F5 key? Cause your ass is refreshing.";
        myJokes[30] = "By all means, marry. If you get a good wife, you’ll become happy; if you get a bad one, you’ll become a philosopher.";
        myJokes[31] = "Marriage is the bond between a person who never remembers anniversaries and another who never forgets them.";
        myJokes[32] = "All marriages are happy. Its the living together afterward that causes all the trouble.";
        myJokes[33] = "If you want to know how your girl will treat you after marriage, just listen to her talking to her little brother.";
        myJokes[34] = "Q: Why did God create man first? \n" + "A: Because he needed a rough working model before creating the perfect specimen of the species";
        myJokes[35] = "Q: Why are married women heavier than single women? \n" + "A: When single women come home they go to see what's in the fridge then go to bed. A married woman comes home, sees what's in bed then goes to the fridge. ";
        myJokes[36] = "Men have two emotions: Hungry and Horny. If you see him without an erection, make him a sandwich. ";
        myJokes[37] = "Q: What is the difference between a battery and a woman? \n" + "A: A battery has a positive side ";
        myJokes[38] = "Q: How do you turn a fox into an elephant? \n" + "A: Marry her ";
        myJokes[39] = "Q: What's 6 inches long, 2 inches wide and drives women wild? \n" + "A: A $100 bill ";
        myJokes[40] = "Q: Whats the difference between love and marriage? \n" + "A: Love is blind and marriage is an eye-opener! ";
        myJokes[41] = "If two wrongs don't make a right, try three.";
        myJokes[42] = "Anyone who says he can see through women is missing a lot.";
        myJokes[43] = "The problem with quotes from the Internet, is that you can never truly verify their authenticity.";
        myJokes[44] = "Friendship is like peeing your pants. Everyone can see it, but only you can truly feel it's warmth";
        myJokes[45] = "Knowledge is knowing a tomato is a fruit. Wisdom is not putting it in a fruit salad";
        myJokes[46] = "Girls Fall in love with what they hear, and guys fall in love with what they see. That's why girls wear make up and guys lie! ";
        myJokes[47] = "I hate when I'm about to hug someone really sexy, and my face hits the mirror. ";
        myJokes[48] = "Why do medications never have any good side effects? Just once I'd like to read a medicine bottle that says, \"May cause extreme sexiness\" ";
        myJokes[49] = "You spend the first 2 years of a child's life teaching them to walk and talk. Then you spend the next 16 years telling them to sit down and shut-up.";

    }


    public String getjoke()
    {
        random = new Random();
        int val = random.nextInt(50);
        //int val = (int )(Math.random() * 49 + 0);
        return myJokes[val];
    }
}
