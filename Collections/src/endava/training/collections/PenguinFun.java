package endava.training.collections;

import java.util.*;
import java.util.List;

public class PenguinFun {

    private static final int NUMBER_OF_PENGUINS = 5;
    private static List<Penguin> penguins = new ArrayList<>();
    private static PenguinHatchery penguinHatchery = new PenguinHatchery();

    public static void penguinsInMap() {

        System.out.println("Penguins in a map: ------------------------------------------");
        Map<PenguinRace, List<Penguin>> penguinMap = new HashMap<>();
        List<Penguin> penguinImperial = new ArrayList<>();
        List<Penguin> penguinRegal = new ArrayList<>();
        List<Penguin> penguinMacaroni = new ArrayList<>();
        List<Penguin> penguinAfrican = new ArrayList<>();
        List<Penguin> penguinAntartic = new ArrayList<>();
        for (Penguin pen : penguins) {
            if (pen.getRace().toString().equals("IMPERIAL"))
                penguinImperial.add(pen);
            else if (pen.getRace().toString().equals("REGAL"))
                penguinRegal.add(pen);
            else if (pen.getRace().toString().equals("MACARONI"))
                penguinMacaroni.add(pen);
            else if (pen.getRace().toString().equals("AFRICAN"))
                penguinAfrican.add(pen);
            else if (pen.getRace().toString().equals("ANTARCTIC"))
                penguinAntartic.add(pen);
        }

        penguinMap.put(PenguinRace.AFRICAN, penguinAfrican);
        penguinMap.put(PenguinRace.ANTARCTIC, penguinAntartic);
        penguinMap.put(PenguinRace.IMPERIAL, penguinImperial);
        penguinMap.put(PenguinRace.MACARONI, penguinMacaroni);
        penguinMap.put(PenguinRace.REGAL, penguinRegal);

        Iterator itMap = penguinMap.entrySet().iterator();
        while (itMap.hasNext()) {
            Map.Entry pair = (Map.Entry) itMap.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }
    }


    public static void showPenguinsList() {

        for (int i = 0; i < NUMBER_OF_PENGUINS; i++) {
            penguins.add(penguinHatchery.hatchPenguin());
        }
        System.out.println("The penguins in a list: ------------------------------------");
        Iterator<Penguin> it = penguins.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    public static void showPenguinsSet() {

        System.out.println("The penguins in a HashSet: ---------------------------------");
        Set<Penguin> penguinSet = new HashSet<>();
        for (int i = 0; i < NUMBER_OF_PENGUINS; i++) {
            penguinSet.add(penguins.get(i));
        }

        Iterator<Penguin> itSet = penguinSet.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }

    }

    public static void orderPenguins() {

        System.out.println("The penguins ordered by race: -------------------------------");
        Collections.sort(penguins, new Comparator<Penguin>() {
            @Override
            public int compare(Penguin o1, Penguin o2) {
                if (o1.getRace().toString().compareTo(o2.getRace().toString()) == 0) {
                    if (o1.getAge() > o2.getAge())
                        return 1;
                    else
                        return -1;
                }
                return o1.getRace().toString().compareTo(o2.getRace().toString());
            }
        });

        for (Penguin pen : penguins) {
            System.out.println(pen);
        }

    }

    public static void setParteners() {

        System.out.println("Setting the partners: ---------------------------------------");

        for (Penguin pen : penguins) {
            pen.setMatingPartners(penguinHatchery.generateRandomPenguins());
            System.out.println(pen);
        }
    }

    public static void orderingByPartners() {

        System.out.println("Ordering the penguins by their partners: --------------------------- ");

        Collections.sort(penguins, new Comparator<Penguin>() {
            @Override
            public int compare(Penguin o1, Penguin o2) {

                if (o1.getMatingPartners().size() > o2.getMatingPartners().size()) {
                    return 1;
                } else if (o1.getMatingPartners().size() < o2.getMatingPartners().size()) {
                    return -1;
                } else if (o1.getMatingPartners().size() == o2.getMatingPartners().size()) {
                    if (o1.averagePartnersAge() > o2.averagePartnersAge())
                        return 1;
                    else if (o1.averagePartnersAge() < o2.averagePartnersAge())
                        return -1;
                }
                return o1.getName().compareTo(o2.getName());

            }
        });

        for (Penguin pen : penguins) {
            System.out.println(pen);
        }

    }

}
