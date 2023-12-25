package edu.spandit3.mysoccerstadiums;


import java.util.ArrayList;
import java.util.List;

public class DataInitializer {
    private static final List<Location> data = new ArrayList<>();

    public static List<Location> getData() {
        return data;
    }

    static {
        data.add(new Location(
                "Allianz Arena",
                "Allianz Arena is a stunning football stadium located in Munich, Bavaria, Germany. " +
                        "It serves as the home ground for FC Bayern Munich. The stadium's modern " +
                        "design and illuminated façade make it a standout architectural marvel. " +
                        "In addition to football matches, Allianz Arena hosts various events and " +
                        "concerts, creating a vibrant atmosphere for fans and visitors alike. " +
                        "With a capacity of 75,000, it stands as one of Europe's premier football arenas, " +
                        "having opened its doors in 2005.",
                "Located in Munich, Germany",
                R.drawable.allianz
        ));

        data.add(new Location(
                "Anfield",
                "Anfield is the historic home stadium of Liverpool Football Club, situated in Liverpool, England. " +
                        "Since its opening in 1884, Anfield has been witness to the triumphs and glory of " +
                        "Liverpool FC. The stadium's iconic 'You'll Never Walk Alone' anthem resonates " +
                        "through the stands, creating an electric atmosphere. Anfield is not just a " +
                        "football venue; it's a place where the spirit of Liverpool FC comes alive.",
                "Located in Liverpool, England",
                R.drawable.anfield
        ));

        data.add(new Location(
                "Camp Nou",
                "Camp Nou, located in Barcelona, Catalonia, Spain, is the legendary home of FC Barcelona. " +
                        "With a seating capacity of 99,354, it is one of the largest stadiums in Europe. " +
                        "Camp Nou is a fortress where the passion of Barça fans merges with the " +
                        "brilliance of the football played by the team. The stadium has witnessed " +
                        "countless historic moments and remains a symbol of Catalan pride.",
                "Located in Barcelona, Spain",
                R.drawable.campnou
        ));

        data.add(new Location(
                "Maracanã",
                "Maracanã, located in Rio de Janeiro, Brazil, is one of the most iconic football stadiums globally. " +
                        "Built for the 1950 FIFA World Cup, it has hosted historic matches and events. " +
                        "The stadium's immense capacity of 78,838 creates an electrifying atmosphere " +
                        "during major football events and concerts. Maracanã stands as a symbol of " +
                        "Brazilian football passion and cultural significance.",
                "Located in Rio de Janeiro, Brazil",
                R.drawable.maracana
        ));

        data.add(new Location(
                "Monterey Stadium",
                "Monterey Stadium is a versatile multi-use stadium situated in Monterey, California, USA. " +
                        "With a capacity of 18,000, it hosts various events, including football matches " +
                        "and concerts. The stadium's scenic coastal location adds to its charm, " +
                        "providing a unique backdrop for sports and entertainment.",
                "Located in Monterey, California, USA",
                R.drawable.monterrey
        ));

        data.add(new Location(
                "Old Trafford",
                "Old Trafford, the historic home of Manchester United, is located in Greater Manchester, England. " +
                        "Built in 1910, it has witnessed the triumphs of one of the most successful football " +
                        "clubs in the world. Old Trafford's capacity of 74,140 and its iconic 'Theatre of " +
                        "Dreams' nickname reflect the grandeur and history of Manchester United.",
                "Located in Greater Manchester, England",
                R.drawable.oldtrafford
        ));

        data.add(new Location(
                "San Siro",
                "San Siro, situated in Milan, Italy, is a legendary football stadium shared by " +
                        "AC Milan and Inter Milan. With a seating capacity of 75,923, it stands as a " +
                        "monument to the passion and rivalry ofthe Milanese clubs. San Siro's unique architectural design and atmosphere create an " +
                        "unforgettable experience for football fans around the world. The stadium " +
                        "was inaugurated in 1926 and has since become an iconic symbol of Italian football.",
                "Located in Milan, Italy",
                R.drawable.sansiro
        ));


        data.add(new Location(
                "Santiago Bernabéu",
                "Santiago Bernabéu is the majestic home stadium of Real Madrid, located in Madrid, Spain. " +
                "With a seating capacity of 81,044, it has been witness to Real Madrid's " +
                "unprecedented success in European football. The stadium's rich history " +
                "and electric atmosphere make it a must-visit for football enthusiasts. " +
                "Having opened its doors in 1992, Santiago Bernabéu stands as a symbol of " +
                "football excellence and Spanish football heritage.",
                "Located in Madrid, Spain",
                R.drawable.santiago
                ));

                data.add(new Location(
                "Signal Iduna Park",
                "Signal Iduna Park, situated in Dortmund, North Rhine-Westphalia, Germany, is the " +
                "imposing home of Borussia Dortmund. With a capacity of 81,365, it boasts " +
                "one of the most passionate and energetic atmospheres in world football. " +
                "The 'Yellow Wall' creates an unforgettable experience for fans.",
                "Located in Dortmund, Germany",
                R.drawable.westfaledortmund
                ));

                data.add(new Location(
                "Wembley Stadium",
                "Wembley Stadium, located in London, England, is a historic venue with a " +
                "capacity of 90,000. It has hosted iconic events, including the " +
                "1966 FIFA World Cup final. Wembley remains a symbol of English football's " +
                "heritage and continues to host major football matches and events.",
                "Located in London, England",
                R.drawable.wembly2
                ));
                }
                }