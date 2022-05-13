package homework;

public class FirstClass {

    public static void main(String[] args) {

//        # Choose any country name and print out
        String country = "Thailand";
        System.out.println("I choose to write about - " + country + ".");

//        # Country population
        long currentPopulation = 67010000;
        System.out.printf(country + " population is %d people.\n", currentPopulation);

//        # Area of the country
        int areaOfTheCountry = 513115;
        System.out.println("The land area of " + country + " is " + areaOfTheCountry + " km\u00b2.");

//        # Capital city of country
        String capitalCity = "Bangkok";
        System.out.println("Capital city of " + country + " is " + capitalCity + ".");

//        # Official national language
        String nationalLanguage = "Thai";
        System.out.println("Official national language of " + country + " is " + nationalLanguage + ".");

//        # Is country a member of the European Union

        boolean isInEU = false;

        if (isInEU) {
            System.out.println(country + " is a member of the European Union.");
        } else {
            System.out.println(country + " is not a member of the European Union.");
        }

//        # National currency

        char nationalCurrency = '\u0E3F';
        System.out.println(country + " national currency is " + nationalCurrency + ".");

//        # Write a few sentences on a free topic using concatenation and format.

        System.out.printf("%s is located on the Indochina Peninsula, ", country);
        System.out.printf("and its capital %s ", capitalCity + " is one of the largest cities in Southeast Asia.");
        System.out.printf("Buddhism is a common religion in %s. " + country + " has a well-developed tourism industry.\n", country);

//        # Write three examples for each arithmetic operator.

        int a = 4;
        int b = 6;

        float c =4.5f;
        float d = 9.5f;

        double e = 25.25d;
        double f =4.07d;

        int i = b % a;
        System.out.println(i);

        int ii = (a + b) % b;
        System.out.println(ii);

        double iii = (a - b) % e;
        System.out.println(iii);

        float h = (c + d) * (d - c) / (c * d);
        System.out.println(h);

        double hh = (a - b * e - f + d) / b;
        System.out.println(hh);

        double hhh = e * b - e / f + d / b;
        System.out.println(hhh);

    }
}
