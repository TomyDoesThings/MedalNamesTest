/**
 * Made By: Tomy (https://osu.ppy.sh/users/14889628)
 * This is a medal name test tool to have
 * players (usually medal hunters) memorize
 * the name of osu! medals with just their icons.
 */

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MedalNamesTest
{
    public static void main(String[] args)
    {
        final int MAX_MEDALS = 300; // Keep this updated manually.

        boolean devPowers = false;
        boolean doHelpUser = false;
        int chanceOfHelp = 0;
        int gainedLives = 0;

        String userGuess;

        JOptionPane.showMessageDialog(null, "Welcome to osu! Name That Medal Test, thought of and " + // Introduction
                "made by Tomy, at least with this version we have right here that is an application.");

        JOptionPane.showMessageDialog(null, "When you hit 0 lives, it's over for you! Got it?");

        String chosenMedals = JOptionPane.showInputDialog(null, "Skill, Hush-Hush, Beatmap Packs, Dedication, Mod Introduction, Beatmap Spotlights, Seasonal Spotlights, and Beatmap Challenge Packs.\n" +
                                                                                      "00000000 means you're tested on none of them. 11111111 means you're tested on all of them.\n" +
                                                                                      "Please enter a series of 0s and 1s that correspond with the medal sets you want to be tested on.");

        switch (chosenMedals)
        {
            case "00000000":
            case "":
                JOptionPane.showMessageDialog(null, "Dios mio. Goodbye.");
                System.exit(0);

            case "11111111":
                JOptionPane.showMessageDialog(null, "スゴイだよね? 時間過ぎとの一杯な逝去と苦痛に準備しろ。");
                break;

            case "chromb":
                try
                {
                    URL currentMedalURL = new URL("https://i.imgur.com/0VJNIYa.png");
                    Image medalImage = ImageIO.read(currentMedalURL);
                    userGuess = JOptionPane.showInputDialog(null,"chromb's chromb chromb chromb chromb chromb chromb?","chromb chromb chromb - " + "chromb chromb chromb", JOptionPane.PLAIN_MESSAGE, new ImageIcon(medalImage), null, "").toString();

                    if (userGuess.equals("chrombium"))
                    {
                        currentMedalURL = new URL("https://assets.ppy.sh/medals/web/osu-secret-bluffing.png");
                        medalImage = ImageIO.read(currentMedalURL);
                        userGuess = JOptionPane.showInputDialog(null,"chromb's chromb chromb chromb chromb chromb chromb?","chromb chromb chromb - " + "chromb chromb chromb", JOptionPane.PLAIN_MESSAGE, new ImageIcon(medalImage), null, "").toString();

                        if (userGuess.equals("Not Bluffing"))
                        {
                            userGuess = JOptionPane.showInputDialog(null, "Chro =x? Chro");
                            if (userGuess.equals("3"))
                            {
                                JOptionPane.showMessageDialog(null, "You got chromb ending. :D");
                                System.exit(0);
                            }
                        }
                        if (userGuess.equals("chromb") || userGuess.equals("Chromb") || userGuess.equals("chromb chromb") || userGuess.equals("Chromb Chromb"))
                        {
                            JOptionPane.showMessageDialog(null, "01110100 01101000 01100101 00100000 01100011 01101000 01110010 01101111 01101101 01100010 00100000 01101001 01101110 01100110 01100101 01110011 01110100 01100001 01110100 01101001 01101111 01101110 00101100 00100000 01100010 01110101 01110100 00101100 00100000 01110100 01101000 01101001 01110011 00100000 01101111 01101110 01100101 00101100 00100000 01110100 01101000 01101001 01110011 00100000 01110100 01101000 01101001 01101110 01100111 00101100 00100000 01101001 01110011 00100000 01101001 01101101 01101101 01110101 01101110 01100101");
                        }
                    }
                    System.exit(0);
                } catch(Exception exception)
                {
                    JOptionPane.showMessageDialog(null, "CHROMB, chromb chromb chromb chromb CHR chrombm'm chromb chromb (chromb chromb chromb chromb chromb), chromb chromb chromb'b chromb chromb chromb chromb. chromb chromb chromb CHROMB. :chromb:");
                    System.exit(0);
                }

            case "Tomy":
                userGuess = JOptionPane.showInputDialog(null, "What is your favorite medal?");

                if (userGuess.equals("Not Bluffing"))
                {
                    userGuess = JOptionPane.showInputDialog(null, "What's the secret password? Uuuhhhh.... Correct! Well, no, that's just the first letter.");

                    if (userGuess.equalsIgnoreCase("Up Up Down Down Left Right Left Right B A Start"))
                    {
                        devPowers = true;
                        JOptionPane.showMessageDialog(null, "You suddenly feel ecstatically invincible!");
                    }
                } else
                {
                    System.exit(0);
                }
                break;

            case "[-Kai]":
            case "Kai":
                JOptionPane.showMessageDialog(null, "I call Period, the Inner Oni diff, an easy map to FC! Can you believe that?! And I even have the audacity to say Mirage is easy too, like wtf! And Feelin' Sky, psssh, it's not too hard. Just gotta hit some more sliders man.");
                JOptionPane.showMessageDialog(null, "However...");
                userGuess = JOptionPane.showInputDialog(null, "What medal did I have the least fun with?");
                if (userGuess.equals("Addicted"))
                {
                    JOptionPane.showMessageDialog(null,"That's [-Kai] for you. I guess this is his ending.");
                }
                System.exit(0);

            case "xxluizxx47":
                JOptionPane.showMessageDialog(null, "100% when? :PauseChamp: By the way that time, 100% of his sanity would be gone." +
                        "\nPlease support this man. \uD83D\uDE22");
                System.exit(0);

            case "MegaMix_Craft":
                JOptionPane.showMessageDialog(null, "IMAGINE IF HE ADDED THIS TO HIS BOT! OH THAT'D BE AWESOME, but is it doable?");
                JOptionPane.showMessageDialog(null, "Or maybe... [REDACTED].");
                System.exit(0);

            case "Remyria":
                JOptionPane.showMessageDialog(null, "Some say he's a boomer, even having his osu! account" +
                        " before skill medals were a thing.");
                System.exit(0);

            case "Voltaeyx":
                JOptionPane.showMessageDialog(null, ":PauseChamp:");
                System.exit(0);

            case "Cyrius":
                JOptionPane.showMessageDialog(null, "His motto is speed. If only I had that.");
                System.exit(0);

            case "OmegaCyrius":
                JOptionPane.showMessageDialog(null, "His motto was and is still speed. If only I had that. \uD83D\uDD75");
                System.exit(0);

            case "Hubz":
            case "Tanza3D":
            case "Hubz (Tanza3D)":
            case "Tanza3D (Hubz)":
            case "mulraf":
                JOptionPane.showMessageDialog(null, "Please go check out what he does.");
                System.exit(0);

            case "Mirage":
            case "mirage":
                JOptionPane.showMessageDialog(null, "I hate you so much. You don't even know.");
                System.exit(0);

            case "Feelin' Sky":
            case "feelin' sky":
            case "Feelin Sky":
            case "feelin sky":
            case "Feeling Sky":
            case "feeling sky":
                JOptionPane.showMessageDialog(null, "WHAT IS WRONG WITH YOU?!?! YAMERO!");
                System.exit(0);

            case "Not Bluffing":
                JOptionPane.showMessageDialog(null, "Now that's a good medal. You die and are reborn.");
                System.exit(0);

            case "ARROGANCE":
                JOptionPane.showMessageDialog(null, "Bop. :D");
                System.exit(0);

            case "E":
                JOptionPane.showMessageDialog(null, "You are now going to take the ULTIMATE Skill (medal) Test. Do you accept your fate?");
                JOptionPane.showMessageDialog(null, "Coming soon maybe, kek. (isn't Tomy's idea)");
                System.exit(0);

            case "pi":
                JOptionPane.showMessageDialog(null, "3.14159265358979323846264338327950288419716939937510...");
                System.exit(0);

            case "Intro to Acting":
            case "Calculus II":
            case "uni":
            case "university":
            case "University":
                JOptionPane.showMessageDialog(null, "Please save me.");
                System.exit(0);

            case "Coppertine":
                JOptionPane.showMessageDialog(null, "My codes being looked at already. :monkaS:");
                System.exit(0);

            case "Java":
            case "java":
                JOptionPane.showMessageDialog(null, "Shoutouts to Java for allowing me to be able to make this program!.");
                System.exit(0);

            case "Save Me":
            case "Save me":
            case "save me":
                doHelpUser = true;
                chanceOfHelp = 10; // out of 100
                JOptionPane.showMessageDialog(null, "Fine (also, I hated trying that strat for 10* pass),\nyou now have a 10% chance on each medal you get right to gain an extra life. :D");
                chosenMedals = JOptionPane.showInputDialog(null, "Skill, Hush-Hush, Beatmap Packs, Dedication, Mod Introduction, Beatmap Spotlights, Seasonal Spotlights, and Beatmap Challenge Packs.\n" +
                        "00000000 means you're tested on none of them. 11111111 means you're tested on all of them.\n" +
                        "Please enter a series of 0s and 1s that correspond with the medal sets you want to be tested on. ANYTHING ELSE will end your run.");
                break;

            default:
                break;

            /*
               Literally this whole switch-case is easter eggs. lol

               This adds a bit more charm to the program.
             */
        }

        if (devPowers)
        {
            chosenMedals = JOptionPane.showInputDialog(null, "Developer, please choose actual sequence of 0s and 1s now.\n" +
                    "Skill, Hush-Hush, Beatmap Packs, Dedication, Mod Introduction, Beatmap Spotlights, Seasonal Spotlights, and Beatmap Challenge Packs.");
        }

        final String testedOn = chosenMedals; // The sets of medals are FINALLY decided here.

        // If user decides to not comply with the instructions.
        if (testedOn.length() != 8)
        {
            System.exit(0);
        }
        for (int i = 0; i < testedOn.length(); ++i)
        {
            if (!Character.isDigit(testedOn.charAt(i)) || !(testedOn.charAt(i) + "").equals("0") && !(testedOn.charAt(i) + "").equals("1"))
            {
                System.exit(0);
            }
        }

        /*
          Booleans that decide which sets are allowed
          are finally done, right here.
         */

        final boolean isDoingSkill = testedOn.charAt(0) == '1';
        final boolean isDoingHushHush = testedOn.charAt(1) == '1';
        final boolean isDoingBeatmapPacks = testedOn.charAt(2) == '1';
        final boolean isDoingDedication = testedOn.charAt(3) == '1';
        final boolean isDoingModIntroduction = testedOn.charAt(4) == '1';
        final boolean isDoingBeatmapSpotlights = testedOn.charAt(5) == '1';
        final boolean isDoingSeasonalSpotlights = testedOn.charAt(6) == '1';
        final boolean isDoingBeatmapChallengePacks = testedOn.charAt(7) == '1';

        int lives;
        int initialLives;
        int lostLives = 0;

        if (!devPowers)
        {
            lives = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose 1-5 lives."));
        } else
        {
            lives = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a pseudo initial 1-5 lives, developer."));
        }
        initialLives = lives;


        switch (lives)
        {
            case 0:
                JOptionPane.showMessageDialog(null, "お前はもう死んでいる ;)");
                JOptionPane.showMessageDialog(null, "You either know what I said, or you don't. The next dialogue box should show you what I mean.");
                System.exit(0);
                break;

            case 1:
                JOptionPane.showMessageDialog(null, "Lunatic you are. I like people like you. We'll see if you make it out alive. >:)");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Reasonable.");
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Normie.");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Oh wow. I've never seen such a coward, easy difficulty user.");
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "Easy mode enjoyer, baby. kek");
                break;

            default:
                JOptionPane.showMessageDialog(null, "To offer any more or any less would be very foolish of me.");
                JOptionPane.showMessageDialog(null, "What fun would there be with so many attempts or already being dead?");
                JOptionPane.showMessageDialog(null, "YOU MUST DIE!");
                System.exit(0);
        }

        if (devPowers)
        {
            lives = 999999999;
            gainedLives = lives - initialLives;
        }

        /*
         When I put the medals in arrays, I have them neatly organized
         to resemble what the medals look like on osu! site.
         This is simply so if new medals are added, the process of
         adding them manually to this program is much easier.

         Do keep in mind though that each new medal is literally a new object in this program, seen from
         Medal insert_medal_name_with_only_letters_numbers_and_underscore = new Medal(medalName, imageLink).
         */

        ArrayList<Medal> remainingMedal = new ArrayList<>();

        if (isDoingSkill)
        {
            // Skill Medal Objects Put In Order From Site - COMPLETE (76)
            Medal fivehundred_combo = new Medal("500 Combo", "https://assets.ppy.sh/medals/web/osu-combo-500.png");
            Medal sevenhundredfifty_combo = new Medal("750 Combo", "https://assets.ppy.sh/medals/web/osu-combo-750.png");
            Medal onek_combo = new Medal("1,000 Combo", "https://assets.ppy.sh/medals/web/osu-combo-1000.png");
            Medal twok_combo = new Medal("2,000 Combo", "https://assets.ppy.sh/medals/web/osu-combo-2000.png");
            Medal i_can_see_the_top = new Medal("I can see the top", "https://assets.ppy.sh/medals/web/all-skill-highranker-1.png");
            Medal the_gradual_rise = new Medal("The gradual rise", "https://assets.ppy.sh/medals/web/all-skill-highranker-2.png");
            Medal scaling_up = new Medal("Scaling up", "https://assets.ppy.sh/medals/web/all-skill-highranker-3.png");
            Medal approaching_the_summit = new Medal("Approaching the summit", "https://assets.ppy.sh/medals/web/all-skill-highranker-4.png");
            Medal rising_star = new Medal("Rising Star", "https://assets.ppy.sh/medals/web/osu-skill-pass-1.png");
            Medal constellation_prize = new Medal("Constellation Prize", "https://assets.ppy.sh/medals/web/osu-skill-pass-2.png");
            Medal building_confidence = new Medal("Building Confidence", "https://assets.ppy.sh/medals/web/osu-skill-pass-3.png");
            Medal insanity_approaches = new Medal("Insanity Approaches", "https://assets.ppy.sh/medals/web/osu-skill-pass-4.png");
            Medal these_clarion_skies = new Medal("These Clarion Skies", "https://assets.ppy.sh/medals/web/osu-skill-pass-5.png");
            Medal above_and_beyond = new Medal("Above and Beyond", "https://assets.ppy.sh/medals/web/osu-skill-pass-6.png");
            Medal supremacy = new Medal("Supremacy", "https://assets.ppy.sh/medals/web/osu-skill-pass-7.png");
            Medal absolution = new Medal("Absolution", "https://assets.ppy.sh/medals/web/osu-skill-pass-8.png");
            Medal event_horizon = new Medal("Event Horizon", "https://assets.ppy.sh/medals/web/osu-skill-pass-9.png");
            Medal phantasm = new Medal("Phantasm", "https://assets.ppy.sh/medals/web/osu-skill-pass-10.png");
            Medal totality = new Medal("Totality", "https://assets.ppy.sh/medals/web/osu-skill-fc-1.png");
            Medal business_as_usual = new Medal("Business As Usual", "https://assets.ppy.sh/medals/web/osu-skill-fc-2.png");
            Medal building_steam = new Medal("Building Steam", "https://assets.ppy.sh/medals/web/osu-skill-fc-3.png");
            Medal moving_forward = new Medal("Moving Forward", "https://assets.ppy.sh/medals/web/osu-skill-fc-4.png");
            Medal paradigm_shift = new Medal("Paradigm Shift", "https://assets.ppy.sh/medals/web/osu-skill-fc-5.png");
            Medal anguish_quelled = new Medal("Anguish Quelled", "https://assets.ppy.sh/medals/web/osu-skill-fc-6.png");
            Medal never_give_up = new Medal("Never Give Up", "https://assets.ppy.sh/medals/web/osu-skill-fc-7.png");
            Medal aberration = new Medal("Aberration", "https://assets.ppy.sh/medals/web/osu-skill-fc-8.png");
            Medal chosen = new Medal("Chosen", "https://assets.ppy.sh/medals/web/osu-skill-fc-9.png");
            Medal unfathomable = new Medal("Unfathomable", "https://assets.ppy.sh/medals/web/osu-skill-fc-10.png");
            Medal my_first_don = new Medal("My First Don", "https://assets.ppy.sh/medals/web/taiko-skill-pass-1.png");
            Medal katsu_katsu_katsu = new Medal("Katsu Katsu Katsu", "https://assets.ppy.sh/medals/web/taiko-skill-pass-2.png");
            Medal not_even_trying = new Medal("Not Even Trying", "https://assets.ppy.sh/medals/web/taiko-skill-pass-3.png");
            Medal face_your_demons = new Medal("Face Your Demons", "https://assets.ppy.sh/medals/web/taiko-skill-pass-4.png");
            Medal the_demon_within = new Medal("The Demon Within", "https://assets.ppy.sh/medals/web/taiko-skill-pass-5.png");
            Medal drumbreaker = new Medal("Drumbreaker", "https://assets.ppy.sh/medals/web/taiko-skill-pass-6.png");
            Medal the_godfather = new Medal("The Godfather", "https://assets.ppy.sh/medals/web/taiko-skill-pass-7.png");
            Medal rhythm_incarnate = new Medal("Rhythm Incarnate", "https://assets.ppy.sh/medals/web/taiko-skill-pass-8.png");
            Medal keeping_time = new Medal("Keeping Time", "https://assets.ppy.sh/medals/web/taiko-skill-fc-1.png");
            Medal to_your_own_beat = new Medal("To Your Own Beat", "https://assets.ppy.sh/medals/web/taiko-skill-fc-2.png");
            Medal big_drums = new Medal("Big Drums", "https://assets.ppy.sh/medals/web/taiko-skill-fc-3.png");
            Medal adversity_overcome = new Medal("Adversity Overcome", "https://assets.ppy.sh/medals/web/taiko-skill-fc-4.png");
            Medal demonslayer = new Medal("Demonslayer", "https://assets.ppy.sh/medals/web/taiko-skill-fc-5.png");
            Medal rhythms_call = new Medal("Rhythm's Call", "https://assets.ppy.sh/medals/web/taiko-skill-fc-6.png");
            Medal time_everlasting = new Medal("Time Everlasting", "https://assets.ppy.sh/medals/web/taiko-skill-fc-7.png");
            Medal the_drummers_throne = new Medal("The Drummer's Throne", "https://assets.ppy.sh/medals/web/taiko-skill-fc-8.png");
            Medal a_slice_of_life = new Medal("A Slice Of Life", "https://assets.ppy.sh/medals/web/fruits-skill-pass-1.png");
            Medal dashing_ever_forward = new Medal("Dashing Ever Forward", "https://assets.ppy.sh/medals/web/fruits-skill-pass-2.png");
            Medal zesty_disposition = new Medal("Zesty Disposition", "https://assets.ppy.sh/medals/web/fruits-skill-pass-3.png");
            Medal hyperdash_on = new Medal("Hyperdash ON!", "https://assets.ppy.sh/medals/web/fruits-skill-pass-4.png");
            Medal its_raining_fruit = new Medal("It's Raining Fruit", "https://assets.ppy.sh/medals/web/fruits-skill-pass-5.png");
            Medal fruit_ninja = new Medal("Fruit Ninja", "https://assets.ppy.sh/medals/web/fruits-skill-pass-6.png");
            Medal dreamcatcher = new Medal("Dreamcatcher", "https://assets.ppy.sh/medals/web/fruits-skill-pass-7.png");
            Medal lord_of_the_catch = new Medal("Lord of the Catch", "https://assets.ppy.sh/medals/web/fruits-skill-pass-8.png");
            Medal sweet_and_sour = new Medal("Sweet And Sour", "https://assets.ppy.sh/medals/web/fruits-skill-fc-1.png");
            Medal reaching_the_core = new Medal("Reaching The Core", "https://assets.ppy.sh/medals/web/fruits-skill-fc-2.png");
            Medal clean_platter = new Medal("Clean Platter", "https://assets.ppy.sh/medals/web/fruits-skill-fc-3.png");
            Medal between_the_rain = new Medal("Between The Rain", "https://assets.ppy.sh/medals/web/fruits-skill-fc-4.png");
            Medal addicted = new Medal("Addicted", "https://assets.ppy.sh/medals/web/fruits-skill-fc-5.png");
            Medal quickening = new Medal("Quickening", "https://assets.ppy.sh/medals/web/fruits-skill-fc-6.png");
            Medal supersonic = new Medal("Supersonic", "https://assets.ppy.sh/medals/web/fruits-skill-fc-7.png");
            Medal dashing_scarlet = new Medal("Dashing Scarlet", "https://assets.ppy.sh/medals/web/fruits-skill-fc-8.png");
            Medal first_steps = new Medal("First Steps", "https://assets.ppy.sh/medals/web/mania-skill-pass-1.png");
            Medal no_normal_player = new Medal("No Normal Player", "https://assets.ppy.sh/medals/web/mania-skill-pass-2.png");
            Medal impulse_drive = new Medal("Impulse Drive", "https://assets.ppy.sh/medals/web/mania-skill-pass-3.png");
            Medal hyperspeed = new Medal("Hyperspeed", "https://assets.ppy.sh/medals/web/mania-skill-pass-4.png");
            Medal ever_onwards = new Medal("Ever Onwards", "https://assets.ppy.sh/medals/web/mania-skill-pass-5.png");
            Medal another_surpassed = new Medal("Another Surpassed", "https://assets.ppy.sh/medals/web/mania-skill-pass-6.png");
            Medal extra_credit = new Medal("Extra Credit", "https://assets.ppy.sh/medals/web/mania-skill-pass-7.png");
            Medal maniac = new Medal ("Maniac", "https://assets.ppy.sh/medals/web/mania-skill-pass-8.png");
            Medal keystruck = new Medal("Keystruck", "https://assets.ppy.sh/medals/web/mania-skill-fc-1.png");
            Medal keying_in = new Medal("Keying In", "https://assets.ppy.sh/medals/web/mania-skill-fc-2.png");
            Medal hyperflow = new Medal("Hyperflow", "https://assets.ppy.sh/medals/web/mania-skill-fc-3.png");
            Medal breakthrough = new Medal("Breakthrough", "https://assets.ppy.sh/medals/web/mania-skill-fc-4.png");
            Medal everything_extra = new Medal("Everything Extra", "https://assets.ppy.sh/medals/web/mania-skill-fc-5.png");
            Medal level_breaker = new Medal("Level Breaker", "https://assets.ppy.sh/medals/web/mania-skill-fc-6.png");
            Medal step_up = new Medal("Step Up", "https://assets.ppy.sh/medals/web/mania-skill-fc-7.png");
            Medal behind_the_veil = new Medal("Behind The Veil", "https://assets.ppy.sh/medals/web/mania-skill-fc-8.png");

            final Medal[] SKILL_MEDALS =
                    {fivehundred_combo, sevenhundredfifty_combo, onek_combo, twok_combo,
                     i_can_see_the_top, the_gradual_rise, scaling_up, approaching_the_summit,
                     rising_star, constellation_prize, building_confidence, insanity_approaches,
                     these_clarion_skies, above_and_beyond, supremacy, absolution,
                     event_horizon, phantasm,
                     totality, business_as_usual, building_steam, moving_forward,
                     paradigm_shift, anguish_quelled, never_give_up, aberration,
                     chosen, unfathomable,
                     my_first_don, katsu_katsu_katsu, not_even_trying, face_your_demons,
                     the_demon_within, drumbreaker, the_godfather, rhythm_incarnate,
                     keeping_time, to_your_own_beat, big_drums, adversity_overcome,
                     demonslayer, rhythms_call, time_everlasting, the_drummers_throne,
                     a_slice_of_life, dashing_ever_forward, zesty_disposition, hyperdash_on,
                     its_raining_fruit, fruit_ninja, dreamcatcher, lord_of_the_catch,
                     sweet_and_sour, reaching_the_core, clean_platter, between_the_rain,
                     addicted, quickening, supersonic, dashing_scarlet,
                     first_steps, no_normal_player, impulse_drive, hyperspeed,
                     ever_onwards, another_surpassed, extra_credit, maniac,
                     keystruck, keying_in, hyperflow, breakthrough,
                     everything_extra, level_breaker, step_up, behind_the_veil};

            Collections.addAll(remainingMedal, SKILL_MEDALS);
        }

        if (isDoingHushHush)
        {
            // Hush-Hush Medal Objects Put In Order From Site - COMPLETE (91)
            Medal dont_let_the_bunny_distract_you = new Medal("Don't let the bunny distract you!", "https://assets.ppy.sh/medals/web/all-secret-bunny.png");
            Medal sranker = new Medal("S-Ranker", "https://assets.ppy.sh/medals/web/all-secret-rank-s.png");
            Medal most_improved = new Medal("Most Improved", "https://assets.ppy.sh/medals/web/all-secret-improved.png");
            Medal nonstop_dancer = new Medal("Non-stop Dancer", "https://assets.ppy.sh/medals/web/all-secret-dancer.png");
            Medal consolation_prize = new Medal("Consolation Prize", "https://assets.ppy.sh/medals/web/all-secret-consolation_prize.png");
            Medal challenge_accepted = new Medal("Challenge Accepted", "https://assets.ppy.sh/medals/web/all-secret-challenge_accepted.png");
            Medal stumbler = new Medal("Stumbler", "https://assets.ppy.sh/medals/web/all-secret-stumbler.png");
            Medal jackpot = new Medal("Jackpot", "https://assets.ppy.sh/medals/web/all-secret-jackpot.png");
            Medal quick_draw = new Medal("Quick Draw", "https://assets.ppy.sh/medals/web/all-secret-quick_draw.png");
            Medal obsessed = new Medal("Obsessed", "https://assets.ppy.sh/medals/web/all-secret-obsessed.png");
            Medal nonstop = new Medal("Nonstop", "https://assets.ppy.sh/medals/web/all-secret-nonstop.png");
            Medal jack_of_all_trades = new Medal("Jack of All Trades", "https://assets.ppy.sh/medals/web/all-secret-jack.png");
            Medal twin_perspectives = new Medal("Twin Perspectives", "https://assets.ppy.sh/medals/web/mania-secret-meganekko.png"); // The only mania Hush-Hush medal, which did throw me off. Huge shoutout to TheMagicAnimals for reminding me.
            Medal perseverance = new Medal("Perseverance", "https://assets.ppy.sh/medals/web/all-secret-perseverance.png");
            Medal feel_the_burn = new Medal("Feel The Burn", "https://assets.ppy.sh/medals/web/all-secret-ftb.png");
            Medal time_dilation = new Medal("Time Dilation", "https://assets.ppy.sh/medals/web/all-secret-tidi.png");
            Medal just_one_second = new Medal("Just One Second", "https://assets.ppy.sh/medals/web/all-secret-onesecond.png");
            Medal afterimage = new Medal("Afterimage", "https://assets.ppy.sh/medals/web/osu-secret-afterimage.png");
            Medal to_the_core = new Medal("To The Core", "https://assets.ppy.sh/medals/web/all-secret-tothecore.png");
            Medal prepared = new Medal("Prepared", "https://assets.ppy.sh/medals/web/all-secret-prepared.png");
            Medal eclipse = new Medal("Eclipse", "https://assets.ppy.sh/medals/web/osu-secret-eclipse.png");
            Medal reckless_abandon = new Medal("Reckless Abandon", "https://assets.ppy.sh/medals/web/all-secret-reckless.png");
            Medal tunnel_vision = new Medal("Tunnel Vision", "https://assets.ppy.sh/medals/web/osu-secret-tunnelvision.png");
            Medal behold_no_deception = new Medal("Behold No Deception", "https://assets.ppy.sh/medals/web/osu-secret-deception.png");
            Medal up_for_the_challenge = new Medal("Up For The Challenge", "https://assets.ppy.sh/medals/web/all-secret-challenge.png");
            Medal lights_out = new Medal("Lights Out", "https://assets.ppy.sh/medals/web/all-secret-lightsout.png");
            Medal unstoppable = new Medal("Unstoppable", "https://assets.ppy.sh/medals/web/osu-secret-superhardhddt.png");
            Medal is_this_real_life = new Medal("Is This Real Life?", "https://assets.ppy.sh/medals/web/osu-secret-supersuperhardhddt.png");
            Medal camera_shy = new Medal("Camera Shy", "https://assets.ppy.sh/medals/web/all-secret-uguushy.png");
            Medal the_sum_of_all_fears = new Medal("The Sum Of All Fears", "https://assets.ppy.sh/medals/web/all-secret-nuked.png");
            Medal dekasight = new Medal("Dekasight", "https://assets.ppy.sh/medals/web/osu-secret-deka.png");
            Medal hour_before_the_dawn = new Medal("Hour Before The Dawn", "https://assets.ppy.sh/medals/web/all-secret-hourbeforethedawn.png");
            Medal slow_and_steady = new Medal("Slow And Steady", "https://assets.ppy.sh/medals/web/all-secret-slowandsteady.png");
            Medal no_time_to_spare = new Medal("No Time To Spare", "https://assets.ppy.sh/medals/web/all-secret-ntts.png");
            Medal sognare = new Medal("Sognare", "https://assets.ppy.sh/medals/web/all-secret-sognare.png");
            Medal realtor_extraordinaire = new Medal("Realtor Extraordinaire", "https://assets.ppy.sh/medals/web/all-secret-realtor.png");
            Medal realitat = new Medal("Realität", "https://assets.ppy.sh/medals/web/all-secret-realitat.png");
            Medal our_mechanical_benefactors = new Medal("Our Mechanical Benefactors", "https://assets.ppy.sh/medals/web/all-secret-ourbenefactors.png");
            Medal meticulous = new Medal("Meticulous", "https://assets.ppy.sh/medals/web/osu-secret-meticulous.png");
            Medal infinitesimal = new Medal("Infinitesimal", "https://assets.ppy.sh/medals/web/osu-secret-infinitesimal.png");
            Medal equilibrium = new Medal("Equilibrium", "https://assets.ppy.sh/medals/web/osu-secret-equilibrium.png");
            Medal impeccable = new Medal("Impeccable", "https://assets.ppy.sh/medals/web/all-secret-impeccable.png");
            Medal elite = new Medal("Elite", "https://assets.ppy.sh/medals/web/all-secret-elite.png");
            Medal fiftyfifty = new Medal("50/50", "https://assets.ppy.sh/medals/web/all-secret-5050.png");
            Medal thrill_of_the_chase = new Medal("Thrill of the Chase", "https://assets.ppy.sh/medals/web/all-secret-thrillofthechase.png");
            Medal the_girl_in_the_forest = new Medal("The Girl in the Forest", "https://assets.ppy.sh/medals/web/all-secret-girlintheforest.png");
            Medal you_cant_hide = new Medal("You Can't Hide", "https://assets.ppy.sh/medals/web/all-secret-youcanthide.png");
            Medal true_torment = new Medal("True Torment", "https://assets.ppy.sh/medals/web/osu-secret-truetorment.png");
            Medal the_firmament_moves = new Medal("The Firmament Moves", "https://assets.ppy.sh/medals/web/all-secret-celestialmovement.png");
            Medal too_fast_too_furious = new Medal("Too Fast, Too Furious", "https://assets.ppy.sh/medals/web/all-secret-toofasttoofurious.png");
            Medal feelin_it = new Medal("Feelin' It", "https://assets.ppy.sh/medals/web/all-secret-feelinit.png");
            Medal overconfident = new Medal("Overconfident", "https://assets.ppy.sh/medals/web/osu-secret-overconfident.png");
            Medal spooked = new Medal("Spooked", "https://assets.ppy.sh/medals/web/osu-secret-spooked.png");
            Medal skylord = new Medal("Skylord", "https://assets.ppy.sh/medals/web/osu-secret-skylord.png");
            Medal brave = new Medal("B-Rave", "https://assets.ppy.sh/medals/web/all-secret-brave.png");
            Medal any = new Medal("Any%", "https://assets.ppy.sh/medals/web/all-secret-anypercent.png");
            Medal mirage = new Medal("Mirage", "https://assets.ppy.sh/medals/web/all-secret-mirage.png");
            Medal under_the_stars = new Medal("Under The Stars", "https://assets.ppy.sh/medals/web/all-secret-underthestars.png");
            Medal senseless = new Medal("Senseless", "https://assets.ppy.sh/medals/web/all-secret-senseless.png");
            Medal aeon = new Medal("Aeon", "https://assets.ppy.sh/medals/web/all-secret-aeon.png");
            Medal upon_the_wind = new Medal("Upon The Wind", "https://assets.ppy.sh/medals/web/all-secret-uponthewind.png");
            Medal vantage = new Medal("Vantage", "https://assets.ppy.sh/medals/web/osu-secret-vantage.png");
            Medal quick_maths = new Medal("Quick Maths", "https://assets.ppy.sh/medals/web/all-secret-quickmaffs.png");
            Medal efflorescence = new Medal("Efflorescence", "https://assets.ppy.sh/medals/web/all-secret-efflorescence.png");
            Medal inundate = new Medal("Inundate", "https://assets.ppy.sh/medals/web/all-secret-inundate.png");
            Medal not_bluffing = new Medal("Not Bluffing", "https://assets.ppy.sh/medals/web/osu-secret-bluffing.png");
            Medal eureka = new Medal("Eureka!", "https://assets.ppy.sh/medals/web/all-secret-eureka.png");
            Medal regicide = new Medal("Regicide", "https://assets.ppy.sh/medals/web/all-secret-regicide.png");
            Medal permadeath = new Medal("Permadeath", "https://assets.ppy.sh/medals/web/all-secret-permadeath.png");
            Medal the_future_is_now = new Medal("The Future Is Now", "https://assets.ppy.sh/medals/web/all-secret-futureisnow.png");
            Medal natural_twenty = new Medal("Natural 20", "https://assets.ppy.sh/medals/web/all-secret-nat20.png");
            Medal kaleidoscope = new Medal("Kaleidoscope", "https://assets.ppy.sh/medals/web/all-secret-kaleidoscope.png");
            Medal ahahahaha = new Medal("AHAHAHAHA", "https://assets.ppy.sh/medals/web/all-secret-yandere.png");
            Medal valediction = new Medal("Valediction", "https://assets.ppy.sh/medals/web/all-secret-valediction.png");
            Medal ten_to_one = new Medal("Ten To One", "https://assets.ppy.sh/medals/web/all-secret-tentoone.png");
            Medal exquisite = new Medal("Exquisite", "https://assets.ppy.sh/medals/web/all-secret-exquisite.png");
            Medal persistence_is_key = new Medal("Persistence Is Key", "https://assets.ppy.sh/medals/web/all-secret-persistenceiskey.png");
            Medal mad_scientist = new Medal("Mad Scientist", "https://assets.ppy.sh/medals/web/all-secret-madscientist.png");
            Medal tribulation = new Medal("Tribulation", "https://assets.ppy.sh/medals/web/all-secret-tribulation.png");
            Medal right_on_time = new Medal("Right On Time", "https://assets.ppy.sh/medals/web/all-secret-rightontime.png");
            Medal replica = new Medal("Replica", "https://assets.ppy.sh/medals/web/all-secret-replica.png");
            Medal all_good = new Medal("All Good", "https://assets.ppy.sh/medals/web/all-secret-allgood.png");
            Medal dead_center = new Medal("Dead Center", "https://assets.ppy.sh/medals/web/all-secret-deadcenter.png");
            Medal in_memoriam = new Medal("In Memoriam", "https://assets.ppy.sh/medals/web/osu-secret-inmemoriam.png");
            Medal sanguine = new Medal("Sanguine", "https://assets.ppy.sh/medals/web/osu-secret-sanguine.png");
            Medal not_again = new Medal("Not Again", "https://assets.ppy.sh/medals/web/all-secret-notagain.png");
            Medal final_boss = new Medal("Final Boss", "https://assets.ppy.sh/medals/web/osu-secret-finalboss.png");
            Medal beast_mode = new Medal("Beast Mode", "https://assets.ppy.sh/medals/web/osu-secret-beastmode.png");
            Medal deliberation = new Medal("Deliberation", "https://assets.ppy.sh/medals/web/all-secret-deliberation.png");
            Medal lightless = new Medal("Lightless", "https://assets.ppy.sh/medals/web/all-secret-lightless.png");
            Medal when_you_see_it = new Medal("When You See It", "https://assets.ppy.sh/medals/web/all-secret-when-you-see-it.png");
            Medal mortal_coils = new Medal("Mortal Coils", "https://assets.ppy.sh/medals/web/all-secret-together-apart.png");
            Medal dark_familiarity = new Medal("Dark Familiarity", "https://assets.ppy.sh/medals/web/all-secret-dark-familiarity.png");
            Medal creators_gambit = new Medal("Creator's Gambit", "https://assets.ppy.sh/medals/web/all-secret-trophy.png");
            Medal time_sink = new Medal("Time Sink", "https://assets.ppy.sh/medals/web/all-secret-time-sink.png");
            Medal unseen_heights = new Medal("Unseen Heights", "https://assets.ppy.sh/medals/web/all-secret-unseen-heights.png");
            Medal youre_here_forever = new Medal("You're Here Forever", "https://assets.ppy.sh/medals/web/all-secret-youre-here-forever.png");
            Medal hospitality = new Medal("Hospitality", "https://assets.ppy.sh/medals/web/all-secret-hospitality.png");
            Medal true_north = new Medal("True North", "https://assets.ppy.sh/medals/web/all-secret-true-north.png");
            Medal astronomic = new Medal("Astronomic", "https://assets.ppy.sh/medals/web/all-secret-astronomic.png");
            Medal superfan = new Medal("Superfan", "https://assets.ppy.sh/medals/web/all-secret-superfan.png");
            Medal iron_will = new Medal("Iron Will", "https://assets.ppy.sh/medals/web/all-secret-iron-will.png");

            final Medal[] HUSH_HUSH_MEDALS =
                    {dont_let_the_bunny_distract_you, sranker, most_improved,nonstop_dancer,
                            consolation_prize, challenge_accepted, stumbler, jackpot,
                            quick_draw, obsessed, nonstop, jack_of_all_trades, twin_perspectives, // Twin Perspectives is awkwardly left hanging as it's mania only.
                            perseverance, feel_the_burn, time_dilation, just_one_second,
                            afterimage, to_the_core, prepared, eclipse,
                            reckless_abandon, tunnel_vision, behold_no_deception, up_for_the_challenge,
                            lights_out, unstoppable, is_this_real_life, camera_shy,
                            the_sum_of_all_fears, dekasight, hour_before_the_dawn, slow_and_steady,
                            no_time_to_spare, sognare, realtor_extraordinaire, realitat,
                            our_mechanical_benefactors, meticulous, infinitesimal, equilibrium,
                            impeccable, elite, fiftyfifty, thrill_of_the_chase,
                            the_girl_in_the_forest, you_cant_hide, true_torment, the_firmament_moves,
                            too_fast_too_furious, feelin_it, overconfident, spooked,
                            skylord, brave, any, mirage,
                            under_the_stars, senseless, aeon, upon_the_wind,
                            vantage, quick_maths, efflorescence, inundate,
                            not_bluffing, eureka, regicide, permadeath,
                            the_future_is_now, natural_twenty, kaleidoscope, ahahahaha,
                            valediction, ten_to_one, exquisite, persistence_is_key,
                            mad_scientist, tribulation, right_on_time, replica,
                            all_good, dead_center, in_memoriam, sanguine,
                            not_again, final_boss, beast_mode, deliberation,
                            lightless, when_you_see_it, mortal_coils, dark_familiarity,
                            creators_gambit, time_sink, unseen_heights, youre_here_forever,
                            hospitality, true_north, astronomic, superfan,
                            iron_will};

            remainingMedal.addAll(Arrays.asList(HUSH_HUSH_MEDALS));
        }

        if (isDoingBeatmapPacks)
        {
            // Beatmap Packs Medal Objects Put In Order From Site - COMPLETE (62)
            Medal video_game_pack_vol1 = new Medal("Video Game Pack vol.1", "https://assets.ppy.sh/medals/web/all-packs-gamer-1.png");
            Medal video_game_pack_vol2 = new Medal("Video Game Pack vol.2", "https://assets.ppy.sh/medals/web/all-packs-gamer-2.png");
            Medal video_game_pack_vol3 = new Medal("Video Game Pack vol.3", "https://assets.ppy.sh/medals/web/all-packs-gamer-3.png");
            Medal video_game_pack_vol4 = new Medal("Video Game Pack vol.4", "https://assets.ppy.sh/medals/web/all-packs-gamer-4.png");
            Medal rhythm_game_pack_vol1 = new Medal("Rhythm Game Pack vol.1", "https://assets.ppy.sh/medals/web/all-packs-rhythm-1.png");
            Medal rhythm_game_pack_vol2 = new Medal("Rhythm Game Pack vol.2", "https://assets.ppy.sh/medals/web/all-packs-rhythm-2.png");
            Medal rhythm_game_pack_vol3 = new Medal("Rhythm Game Pack vol.3", "https://assets.ppy.sh/medals/web/all-packs-rhythm-3.png");
            Medal rhythm_game_pack_vol4 = new Medal("Rhythm Game Pack vol.4", "https://assets.ppy.sh/medals/web/all-packs-rhythm-4.png");
            Medal internet_pack_vol1 = new Medal("Internet! Pack vol.1", "https://assets.ppy.sh/medals/web/all-packs-internet-1.png");
            Medal internet_pack_vol2 = new Medal("Internet! Pack vol.2", "https://assets.ppy.sh/medals/web/all-packs-internet-2.png");
            Medal internet_pack_vol3 = new Medal("Internet! Pack vol.3", "https://assets.ppy.sh/medals/web/all-packs-internet-3.png");
            Medal internet_pack_vol4 = new Medal("Internet! Pack vol.4", "https://assets.ppy.sh/medals/web/all-packs-internet-4.png");
            Medal anime_pack_vol1 = new Medal("Anime Pack vol.1", "https://assets.ppy.sh/medals/web/all-packs-anime-1.png");
            Medal anime_pack_vol2 = new Medal("Anime Pack vol.2", "https://assets.ppy.sh/medals/web/all-packs-anime-2.png");
            Medal anime_pack_vol3 = new Medal("Anime Pack vol.3", "https://assets.ppy.sh/medals/web/all-packs-anime-3.png");
            Medal anime_pack_vol4 = new Medal("Anime Pack vol.4", "https://assets.ppy.sh/medals/web/all-packs-anime-4.png");
            Medal motoloid = new Medal("MOtOLOiD", "https://assets.ppy.sh/medals/web/all-packs-motoloid.png");
            Medal cranky = new Medal("Cranky", "https://assets.ppy.sh/medals/web/all-packs-cranky.png");
            Medal high_tea_music = new Medal("High Tea Music", "https://assets.ppy.sh/medals/web/all-packs-highteamusic.png");
            Medal culprate = new Medal("Culprate", "https://assets.ppy.sh/medals/web/all-packs-culprate.png");
            Medal hyun = new Medal("HyuN", "https://assets.ppy.sh/medals/web/all-packs-hyun.png");
            Medal imperial_circus_dead_decadence = new Medal("Imperial Circus Dead Decadence", "https://assets.ppy.sh/medals/web/all-packs-icdd.png");
            Medal tieff = new Medal("tieff", "https://assets.ppy.sh/medals/web/all-packs-tieff.png");
            Medal afterparty = new Medal("Afterparty", "https://assets.ppy.sh/medals/web/all-packs-afterparty.png");
            Medal ben_briggs = new Medal("Ben Briggs", "https://assets.ppy.sh/medals/web/all-packs-benbriggs.png");
            Medal carpool_tunnel = new Medal("Carpool Tunnel", "https://assets.ppy.sh/medals/web/all-packs-carpooltunnel.png");
            Medal creo = new Medal("Creo", "https://assets.ppy.sh/medals/web/all-packs-creo.png");
            Medal cysmix = new Medal("cYsmix", "https://assets.ppy.sh/medals/web/all-packs-cysmix.png");
            Medal fractal_dreamers = new Medal("Fractal Dreamers", "https://assets.ppy.sh/medals/web/all-packs-fractaldreamers.png");
            Medal lukhash = new Medal("LukHash", "https://assets.ppy.sh/medals/web/all-packs-lukhash.png");
            Medal namirin = new Medal("*namirin", "https://assets.ppy.sh/medals/web/all-packs-namirin.png");
            Medal onumi = new Medal("onumi", "https://assets.ppy.sh/medals/web/all-packs-onumi.png");
            Medal the_flashbulb = new Medal("The Flashbulb", "https://assets.ppy.sh/medals/web/all-packs-theflashbulb.png");
            Medal undead_corporation = new Medal("Undead Corporation", "https://assets.ppy.sh/medals/web/all-packs-undeadcorporation.png");
            Medal wisp_x = new Medal("Wisp X", "https://assets.ppy.sh/medals/web/all-packs-wispx.png");
            Medal camellia_i = new Medal("Camellia I", "https://assets.ppy.sh/medals/web/all-packs-camellia-1.png");
            Medal celldweller = new Medal("Celldweller", "https://assets.ppy.sh/medals/web/all-packs-celldweller.png");
            Medal cranky_ii = new Medal("Cranky II", "https://assets.ppy.sh/medals/web/all-packs-cranky2.png");
            Medal cute_anime_girls = new Medal("Cute Anime Girls", "https://assets.ppy.sh/medals/web/all-packs-CuteAnimeGirls.png");
            Medal elfensjon = new Medal("ELFENSJoN", "https://assets.ppy.sh/medals/web/all-packs-ELFENSJoN.png");
            Medal hyper_potions = new Medal("Hyper Potions", "https://assets.ppy.sh/medals/web/all-packs-HyperPotions.png");
            Medal kola_kid = new Medal("Kola Kid", "https://assets.ppy.sh/medals/web/all-packs-KolaKid.png");
            Medal leaf = new Medal("LeaF", "https://assets.ppy.sh/medals/web/all-packs-leaf.png");
            Medal panda_eyes = new Medal("Panda Eyes", "https://assets.ppy.sh/medals/web/all-packs-PandaEyes.png");
            Medal pup = new Medal("PUP", "https://assets.ppy.sh/medals/web/all-packs-PUP.png");
            Medal ricky_montgomery = new Medal("Ricky Montgomery", "https://assets.ppy.sh/medals/web/all-packs-RickyMontgomery.png");
            Medal rin = new Medal("Rin", "https://assets.ppy.sh/medals/web/all-packs-Rin.png");
            Medal s3rl = new Medal("S3RL", "https://assets.ppy.sh/medals/web/all-packs-S3RL.png");
            Medal sound_souler = new Medal("Sound Souler", "https://assets.ppy.sh/medals/web/all-packs-SoundSouler.png");
            Medal teminite = new Medal("Teminite", "https://assets.ppy.sh/medals/web/all-packs-Teminite.png");
            Medal vinxis = new Medal("VINXIS", "https://assets.ppy.sh/medals/web/all-packs-VINXIS.png");
            Medal touhou_pack = new Medal("Touhou Pack", "https://assets.ppy.sh/medals/web/all-packs-touhou.png");
            Medal ginkiha_pack = new Medal("ginkiha Pack", "https://assets.ppy.sh/medals/web/all-packs-ginkiha.png");
            Medal vocaloid_pack = new Medal("Vocaloid Pack", "https://assets.ppy.sh/medals/web/all-packs-vocaloid.png");
            Medal maduk_pack = new Medal("Maduk Pack", "https://assets.ppy.sh/medals/web/all-packs-maduk.png");
            Medal omoi_pack = new Medal("Omoi Pack", "https://assets.ppy.sh/medals/web/all-packs-omoi.png");
            Medal chill_pack = new Medal("Chill Pack", "https://assets.ppy.sh/medals/web/all-packs-chill.png");
            Medal rohi_pack = new Medal("Rohi Pack", "https://assets.ppy.sh/medals/web/all-packs-rohi.png");
            Medal drum_and_bass_pack = new Medal("Drum & Bass Pack", "https://assets.ppy.sh/medals/web/all-packs-drum_and_bass.png");
            Medal aitsuki_nakuru_pack = new Medal("Aitsuki Nakuru Pack", "https://assets.ppy.sh/medals/web/all-packs-aitsuki.png");
            Medal mappers_guild_pack_i = new Medal("Mappers' Guild Pack I", "https://assets.ppy.sh/medals/web/all-packs-mappersguild-01.png");
            Medal mappers_guild_pack_ii = new Medal("Mappers' Guild Pack II", "https://assets.ppy.sh/medals/web/all-packs-mappersguild-02.png");
            Medal mappers_guild_pack_iii = new Medal("Mappers' Guild Pack III", "https://assets.ppy.sh/medals/web/all-packs-mappersguild-03.png");
            Medal mappers_guild_pack_iv = new Medal("Mappers' Guild Pack IV", "https://assets.ppy.sh/medals/web/all-packs-mappersguild-04.png");
            Medal mappers_guild_pack_v = new Medal("Mappers' Guild Pack V", "https://assets.ppy.sh/medals/web/all-packs-mappersguild-05.png");
            Medal mappers_guild_pack_vi = new Medal("Mappers' Guild Pack VI", "https://assets.ppy.sh/medals/web/all-packs-mappersguild-06.png");

            final Medal[] BEATMAP_PACKS_MEDALS =
                            {video_game_pack_vol1, video_game_pack_vol2, video_game_pack_vol3, video_game_pack_vol4,
                            rhythm_game_pack_vol1, rhythm_game_pack_vol2, rhythm_game_pack_vol3, rhythm_game_pack_vol4,
                            internet_pack_vol1, internet_pack_vol2, internet_pack_vol3, internet_pack_vol4,
                            anime_pack_vol1, anime_pack_vol2, anime_pack_vol3, anime_pack_vol4,
                            motoloid, cranky, high_tea_music, culprate,
                            hyun, imperial_circus_dead_decadence, tieff, afterparty,
                            ben_briggs, carpool_tunnel, creo, cysmix,
                            fractal_dreamers, lukhash, namirin, onumi,
                            the_flashbulb, undead_corporation, wisp_x, camellia_i,
                            celldweller, cranky_ii, cute_anime_girls, elfensjon,
                            hyper_potions, kola_kid, leaf, panda_eyes,
                            pup, ricky_montgomery, rin, s3rl,
                            sound_souler, teminite, vinxis, touhou_pack,
                            ginkiha_pack, vocaloid_pack, maduk_pack, aitsuki_nakuru_pack,
                            omoi_pack, chill_pack, rohi_pack, drum_and_bass_pack,
                            mappers_guild_pack_i, mappers_guild_pack_ii, mappers_guild_pack_iii, mappers_guild_pack_iv,
                            mappers_guild_pack_v, mappers_guild_pack_vi};

            remainingMedal.addAll(Arrays.asList(BEATMAP_PACKS_MEDALS));
        }

        if (isDoingDedication)
        {
            // Dedication Medal Objects Put In Order From Site - COMPLETE (16)
            Medal fivek_plays = new Medal("5,000 Plays", "https://assets.ppy.sh/medals/web/osu-plays-5000.png");
            Medal fifteenk_plays = new Medal("15,000 Plays", "https://assets.ppy.sh/medals/web/osu-plays-15000.png");
            Medal twentyfivek_plays = new Medal("25,000 Plays", "https://assets.ppy.sh/medals/web/osu-plays-25000.png");
            Medal fiftyk_plays = new Medal("50,000 Plays", "https://assets.ppy.sh/medals/web/osu-plays-50000.png");
            Medal thirtyk_drum_hits = new Medal("30,000 Drum Hits", "https://assets.ppy.sh/medals/web/taiko-hits-30000.png");
            Medal threehundredk_drum_hits = new Medal("300,000 Drum Hits", "https://assets.ppy.sh/medals/web/taiko-hits-300000.png");
            Medal threem_drum_hits = new Medal("3,000,000 Drum Hits", "https://assets.ppy.sh/medals/web/taiko-hits-3000000.png");
            Medal thirtym_drum_hits = new Medal("30,000,000 Drum Hits", "https://assets.ppy.sh/medals/web/taiko-hits-30000000.png"); // IT WAS ADDED
            Medal catch_20k_fruits = new Medal("Catch 20,000 fruits", "https://assets.ppy.sh/medals/web/fruits-hits-20000.png");
            Medal catch_200k_fruits = new Medal("Catch 200,000 fruits", "https://assets.ppy.sh/medals/web/fruits-hits-200000.png");
            Medal catch_2m_fruits = new Medal("Catch 2,000,000 fruits", "https://assets.ppy.sh/medals/web/fruits-hits-2000000.png");
            Medal catch_20m_fruits = new Medal("Catch 20,000,000 fruits", "https://assets.ppy.sh/medals/web/fruits-hits-20000000.png"); // IT WAS ADDED
            Medal fortyk_keys = new Medal("40,000 Keys", "https://assets.ppy.sh/medals/web/mania-hits-40000.png");
            Medal fourhundredk_keys = new Medal("400,000 Keys", "https://assets.ppy.sh/medals/web/mania-hits-400000.png");
            Medal fourm_keys = new Medal("4,000,000 Keys", "https://assets.ppy.sh/medals/web/mania-hits-4000000.png");
            Medal fortym_keys = new Medal("40,000,000 Keys", "https://assets.ppy.sh/medals/web/mania-hits-40000000.png");

            final Medal[] DEDICATION_MEDALS =
                    {fivek_plays, fifteenk_plays, twentyfivek_plays, fiftyk_plays,
                     thirtyk_drum_hits, threehundredk_drum_hits, threem_drum_hits, thirtym_drum_hits,
                     catch_20k_fruits, catch_200k_fruits, catch_2m_fruits, catch_20m_fruits,
                     fortyk_keys, fourhundredk_keys, fourm_keys, fortym_keys};

            remainingMedal.addAll(Arrays.asList(DEDICATION_MEDALS));
        }

        if (isDoingModIntroduction)
        {
            // Mod Introduction Medal Objects Put In Order From Site - COMPLETE (11)
            Medal finality = new Medal("Finality", "https://assets.ppy.sh/medals/web/all-intro-suddendeath.png");
            Medal perfectionist = new Medal("Perfectionist", "https://assets.ppy.sh/medals/web/all-intro-perfect.png");
            Medal rock_around_the_clock = new Medal("Rock Around The Clock", "https://assets.ppy.sh/medals/web/all-intro-hardrock.png");
            Medal time_and_a_half = new Medal("Time And A Half", "https://assets.ppy.sh/medals/web/all-intro-doubletime.png");
            Medal sweet_rave_party = new Medal("Sweet Rave Party", "https://assets.ppy.sh/medals/web/all-intro-nightcore.png");
            Medal blindsight = new Medal("Blindsight", "https://assets.ppy.sh/medals/web/all-intro-hidden.png");
            Medal are_you_afraid_of_the_dark = new Medal("Are You Afraid Of The Dark?", "https://assets.ppy.sh/medals/web/all-intro-flashlight.png");
            Medal dial_it_right_back = new Medal("Dial It Right Back", "https://assets.ppy.sh/medals/web/all-intro-easy.png");
            Medal risk_averse = new Medal("Risk Averse", "https://assets.ppy.sh/medals/web/all-intro-nofail.png");
            Medal slowboat = new Medal("Slowboat", "https://assets.ppy.sh/medals/web/all-intro-halftime.png");
            Medal burned_out = new Medal("Burned Out", "https://assets.ppy.sh/medals/web/all-intro-spunout.png");

            final Medal[] MOD_INTRODUCTION_MEDALS =
                    {finality, perfectionist, rock_around_the_clock, time_and_a_half,
                     sweet_rave_party, blindsight, are_you_afraid_of_the_dark, dial_it_right_back,
                     risk_averse, slowboat, burned_out};

            remainingMedal.addAll(Arrays.asList(MOD_INTRODUCTION_MEDALS));
        }

        if (isDoingBeatmapSpotlights)
        {
            // Beatmap Spotlights Medal Objects Put In Order From Site - COMPLETE (15)
            Medal januaryfebruary_2017_spotlight = new Medal("January/February 2017 Spotlight", "https://assets.ppy.sh/medals/web/spotlight-2017-01.png");
            Medal march_2017_spotlight = new Medal("March 2017 Spotlight", "https://assets.ppy.sh/medals/web/spotlight-2017-03.png");
            Medal april_2017_spotlight = new Medal("April 2017 Spotlight", "https://assets.ppy.sh/medals/web/spotlight-2017-04.png");
            Medal may_2017_spotlight = new Medal("May 2017 Spotlight", "https://assets.ppy.sh/medals/web/spotlight-2017-05.png");
            Medal june_2017_spotlight = new Medal("June 2017 Spotlight", "https://assets.ppy.sh/medals/web/spotlight-2017-06.png");
            Medal july_2017_spotlight = new Medal("July 2017 Spotlight", "https://assets.ppy.sh/medals/web/spotlight-2017-07.png");
            Medal august_2017_spotlight = new Medal ("August 2017 Spotlight", "https://assets.ppy.sh/medals/web/spotlight-2017-08.png");
            Medal september_2017_spotlight = new Medal("September 2017 Spotlight", "https://assets.ppy.sh/medals/web/spotlight-2017-09.png");
            Medal october_2017_spotlight = new Medal("October 2017 Spotlight", "https://assets.ppy.sh/medals/web/spotlight-2017-10.png");
            Medal november_2017_spotlight = new Medal("November 2017 Spotlight", "https://assets.ppy.sh/medals/web/spotlight-2017-11.png");
            Medal december_2017_spotlight = new Medal("December 2017 Spotlight", "https://assets.ppy.sh/medals/web/spotlight-2017-12.png");
            Medal january_2018_spotlight = new Medal("January 2018 Spotlight", "https://assets.ppy.sh/medals/web/spotlight-2018-01.png");
            Medal february_2018_spotlight = new Medal("February 2018 Spotlight", "https://assets.ppy.sh/medals/web/spotlight-2018-02.png");
            Medal march_2018_spotlight = new Medal("March 2018 Spotlight", "https://assets.ppy.sh/medals/web/spotlight-2018-03.png");
            Medal april_2018_spotlight = new Medal("April 2018 Spotlight", "https://assets.ppy.sh/medals/web/spotlight-2018-04.png");

            final Medal[] BEATMAP_SPOTLIGHTS_MEDALS =
                    {januaryfebruary_2017_spotlight, march_2017_spotlight, april_2017_spotlight, may_2017_spotlight,
                     june_2017_spotlight, july_2017_spotlight, august_2017_spotlight, september_2017_spotlight,
                     october_2017_spotlight, november_2017_spotlight, december_2017_spotlight, january_2018_spotlight,
                     february_2018_spotlight, march_2018_spotlight, april_2018_spotlight};

            remainingMedal.addAll(Arrays.asList(BEATMAP_SPOTLIGHTS_MEDALS));
        }

        if (isDoingSeasonalSpotlights)
        {
            // Seasonal Spotlights Medal Objects Put In Order From Site - COMPLETE (7)
            Medal summer_2018_beatmap_spotlights = new Medal("Summer 2018 Beatmap Spotlights", "https://assets.ppy.sh/medals/web/spotlight-2018-summer.png");
            Medal fall_2018_beatmap_spotlights = new Medal("Fall 2018 Beatmap Spotlights", "https://assets.ppy.sh/medals/web/spotlight-2018-autumn.png");
            Medal winter_2019_beatmap_spotlights = new Medal("Winter 2019 Beatmap Spotlights", "https://assets.ppy.sh/medals/web/spotlight-2019-winter.png");
            Medal spring_2019_beatmap_spotlights = new Medal("Spring 2019 Beatmap Spotlights", "https://assets.ppy.sh/medals/web/spotlight-2019-spring.png");
            Medal summer_2019_beatmap_spotlights = new Medal("Summer 2019 Beatmap Spotlights", "https://assets.ppy.sh/medals/web/spotlight-2019-summer.png");
            Medal autumn_2019_beatmap_spotlights = new Medal("Autumn 2019 Beatmap Spotlights", "https://assets.ppy.sh/medals/web/spotlight-2019-autumn.png");
            Medal winter_2020_beatmap_spotlights = new Medal("Winter 2020 Beatmap Spotlights", "https://assets.ppy.sh/medals/web/spotlight-2020-winter.png");

            final Medal[] SEASONAL_SPOTLIGHTS_MEDALS =
                    {summer_2018_beatmap_spotlights, fall_2018_beatmap_spotlights,
                     winter_2019_beatmap_spotlights, spring_2019_beatmap_spotlights, summer_2019_beatmap_spotlights, autumn_2019_beatmap_spotlights,
                     winter_2020_beatmap_spotlights};

            remainingMedal.addAll(Arrays.asList(SEASONAL_SPOTLIGHTS_MEDALS));
        }

        if (isDoingBeatmapChallengePacks)
        {
            // Beatmap Pack Challenge Packs Medal Objects Put In Order From Site - COMPLETE (5)
            Medal camellia_ii = new Medal("Camellia II", "https://assets.ppy.sh/medals/web/all-packs-camellia-2.png");
            Medal muzz_pack = new Medal("MUZZ Pack", "https://assets.ppy.sh/medals/web/all-packs-muzz.png");
            Medal ariableyes_pack = new Medal("Ariabl'eyeS Pack", "https://assets.ppy.sh/medals/web/all-packs-ariableyes.png");
            Medal usao_pack = new Medal("USAO Pack", "https://assets.ppy.sh/medals/web/all-packs-usao.png");
            Medal mappers_guild_pack_vii = new Medal("Mappers' Guild Pack VII", "https://assets.ppy.sh/medals/web/all-packs-mappersguild-07.png");
            Medal mappers_guild_pack_viii = new Medal("Mappers' Guild Pack VIII", "https://assets.ppy.sh/medals/web/all-packs-mappersguild-08.png");
            Medal mappers_guild_pack_ix = new Medal("Mappers' Guild Pack IX", "https://assets.ppy.sh/medals/web/all-packs-mappersguild-09.png");

            final Medal[] BEATMAP_CHALLENGE_PACKS_MEDALS =
                    {camellia_ii, muzz_pack, ariableyes_pack, usao_pack,
                     mappers_guild_pack_vii, mappers_guild_pack_viii, mappers_guild_pack_ix};

            remainingMedal.addAll(Arrays.asList(BEATMAP_CHALLENGE_PACKS_MEDALS));
        }

        JOptionPane.showMessageDialog(null, remainingMedal.size() + " medals have been loaded.");
        JOptionPane.showMessageDialog(null, "Tomy wishes you the best of luck, but mostly *dedication and skill*. :D");

        if (remainingMedal.size() == MAX_MEDALS && initialLives == 1)
        {
            JOptionPane.showMessageDialog(null, "一体何コレ！？ ＼(º □ º l|l)/ - WELCOME TO IMPOSSIBLE MODE\n\nYou chose the hardest settings there are to be offered. Good freaking luck.");
        }

        int currentMedalElement;
        Random rng = new Random();
        Image medalImage;

        try {
            do {
                currentMedalElement = rng.nextInt(remainingMedal.size());

                URL currentMedalURL = new URL(remainingMedal.get(currentMedalElement).getImageLink());
                medalImage = ImageIO.read(currentMedalURL);

                if (doHelpUser && lives == 1)
                {
                    if (JOptionPane.showInputDialog("Do you want first letter to the next medal? (Say \"Yes\")").equalsIgnoreCase("Yes"))
                    {
                        JOptionPane.showMessageDialog(null, "It is \"" + remainingMedal.get(currentMedalElement).getMedalName().charAt(0) + "\".\nGood luck.");
                    }
                }

                if (lives > 1 && remainingMedal.size() > 1)
                {
                    userGuess = JOptionPane.showInputDialog(null,"What's the exact name of this medal?",lives + " Lives Remaining - " + remainingMedal.size() + " Medals Remaining", JOptionPane.PLAIN_MESSAGE, new ImageIcon(medalImage), null, "").toString();
                } else if (lives == 1 && remainingMedal.size() == 1)
                {
                    userGuess = JOptionPane.showInputDialog(null,"What's the exact name of this medal?", lives + " Life Remaining - " + remainingMedal.size() + " Medal Remaining", JOptionPane.PLAIN_MESSAGE, new ImageIcon(medalImage), null, "").toString();
                } else if (lives > 1 && remainingMedal.size() == 1)
                {
                    userGuess = JOptionPane.showInputDialog(null,"What's the exact name of this medal?", lives + " Lives Remaining - " + remainingMedal.size() + " Medal Remaining", JOptionPane.PLAIN_MESSAGE, new ImageIcon(medalImage), null, "").toString();
                } else
                {
                    userGuess = JOptionPane.showInputDialog(null,"What's the exact name of this medal?", lives + " Life Remaining - " + remainingMedal.size() + " Medals Remaining", JOptionPane.PLAIN_MESSAGE, new ImageIcon(medalImage), null, "").toString();
                }

                if (userGuess.equals(remainingMedal.get(currentMedalElement).getMedalName()))
                {
                    remainingMedal.remove(currentMedalElement);
                    if (doHelpUser)
                    {
                        if (rng.nextInt(chanceOfHelp) == 9)
                        {
                            ++lives;
                            ++gainedLives;
                            JOptionPane.showMessageDialog(null, "You got lucky and received an extra life!");
                        }
                    }
                } else
                {
                    if (remainingMedal.get(currentMedalElement).getMedalName().equals("Camellia II") && userGuess.equalsIgnoreCase("Feelin' Sky"))
                    {
                        JOptionPane.showMessageDialog(null, "Game over. You're dead, but don't worry, practice makes you closer to perfect.");
                        System.exit(0);
                    }
                    --lives;
                    ++lostLives;
                    JOptionPane.showMessageDialog(null, "That's wrong. The exact medal name is: \"" + remainingMedal.get(currentMedalElement).getMedalName() + "\"\nAnd you typed: \"" + userGuess + "\"");
                    if (lives <= 0)
                    {
                        JOptionPane.showMessageDialog(null, "Game over. You're dead, but don't worry, practice makes you closer to perfect.");
                        System.exit(0);
                    }
                }
            } while (remainingMedal.size() > 0);
        } catch (Exception exception)
        {
            JOptionPane.showMessageDialog(null, "WOAH, either a medal image URL couldn't be read (perhaps from no internet connection),\n or you tried to exit this program (not answering the question). This means you DIE. \uD83D\uDE14");
            lives = 0; // Done for the sake of really feeling like the user is dead. I know the user doesn't actually know this though.
            System.exit(0);
        }

        if (initialLives > 1 || initialLives == 0 && lostLives > 1)
        {
            JOptionPane.showMessageDialog(null, "Congratulations! You were able to guess all the medals!\n\nTested on: " + testedOn + "\nChose: " + initialLives + " lives.\nLost: " + lostLives + " lives." + "\nデヴモードＯＮ： " + devPowers + "\nAssistance: " + doHelpUser + "\nGained Lives: " + gainedLives + "\n\nSkill: " + isDoingSkill + "\nHush-Hush: " + isDoingHushHush + "\nBeatmap Packs: " + isDoingBeatmapPacks + "\nDedication: " + isDoingDedication + "\nMod Introduction: " + isDoingModIntroduction + "\nBeatmap Spotlights: " + isDoingBeatmapSpotlights + "\nSeasonal Spotlights: " + isDoingSeasonalSpotlights + "\nBeatmap Challenge Packs: " + isDoingBeatmapChallengePacks);
        } else if (initialLives == 1 && lostLives == 1)
        {
            JOptionPane.showMessageDialog(null, "Congratulations! You were able to guess all the medals!\n\nTested on: " + testedOn + "\nChose: " + initialLives + " life.\nLost: " + lostLives + " life." + "\nデヴモードＯＮ： " + devPowers + "\nAssistance: " + doHelpUser + "\nGained Lives: " + gainedLives + "\n\nSkill: " + isDoingSkill + "\nHush-Hush: " + isDoingHushHush + "\nBeatmap Packs: " + isDoingBeatmapPacks + "\nDedication: " + isDoingDedication + "\nMod Introduction: " + isDoingModIntroduction + "\nBeatmap Spotlights: " + isDoingBeatmapSpotlights + "\nSeasonal Spotlights: " + isDoingSeasonalSpotlights + "\nBeatmap Challenge Packs: " + isDoingBeatmapChallengePacks);
        } else if (initialLives > 1 || initialLives == 0 && lostLives == 1)
        {
            JOptionPane.showMessageDialog(null, "Congratulations! You were able to guess all the medals!\n\nTested on: " + testedOn + "\nChose: " + initialLives + " lives.\nLost: " + lostLives + " life." + "\nデヴモードＯＮ： " + devPowers + "\nAssistance: " + doHelpUser + "\nGained Lives: " + gainedLives + "\n\nSkill: " + isDoingSkill + "\nHush-Hush: " + isDoingHushHush + "\nBeatmap Packs: " + isDoingBeatmapPacks + "\nDedication: " + isDoingDedication + "\nMod Introduction: " + isDoingModIntroduction + "\nBeatmap Spotlights: " + isDoingBeatmapSpotlights + "\nSeasonal Spotlights: " + isDoingSeasonalSpotlights + "\nBeatmap Challenge Packs: " + isDoingBeatmapChallengePacks);
        } else
        {
            JOptionPane.showMessageDialog(null, "Congratulations! You were able to guess all the medals!\n\nTested on: " + testedOn + "\nChose: " + initialLives + " life.\nLost: " + lostLives + " lives." + "\nデヴモードＯＮ： " + devPowers + "\nAssistance: " + doHelpUser + "\nGained Lives: " + gainedLives + "\n\nSkill: " + isDoingSkill + "\nHush-Hush: " + isDoingHushHush + "\nBeatmap Packs: " + isDoingBeatmapPacks + "\nDedication: " + isDoingDedication + "\nMod Introduction: " + isDoingModIntroduction + "\nBeatmap Spotlights: " + isDoingBeatmapSpotlights + "\nSeasonal Spotlights: " + isDoingSeasonalSpotlights + "\nBeatmap Challenge Packs: " + isDoingBeatmapChallengePacks);
        }

        switch (initialLives)
        {
            case 5:
                JOptionPane.showMessageDialog(null, "Consider using 4 lives or less though next time, alright, baby?");
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "Consider using 3 lives or less though next time, alright, child?");
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "You did alright. Consider using 2 lives or 1 next time for an extra challenge, alright?");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "You did fantastic, however, if you're so confident, do it with 1 life then? Show me that you can do this test perfectly. >:)");
                break;

            case 1:
                JOptionPane.showMessageDialog(null, "Holy smokes. YOU DID IT! You know every medal that was in the test you chose! I'm so proud of you! That makes you even more of a medal hunter, and hell, even medal collector.");
                JOptionPane.showMessageDialog(null, "For the user who made it here, this is the dedication I like to see! Keep going! :D");
                if (Medal.medalCount == MAX_MEDALS)
                {
                    JOptionPane.showMessageDialog(null, "You can't possibly be human, or legit, maybe? Yeah, show us the recording with webcam or something. lmao");
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "This message should not appear. If you see this, it's some sort of bug or hack that happened.");
                JOptionPane.showMessageDialog(null, "https://www.youtube.com/watch?v=dQw4w9WgXcQ");
                break;
        }
    }
}
