package com.example.assignment5.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
//        for (int i = 1; i <= COUNT; i++) {
//            addItem(createDummyItem(i));
//        }
        addItem(new DummyItem("1", "Frozen Zabaglione", "Marsala wine is the star of the show in this frozen treat. " +
        "It gets mixed up with egg yolks, sugar, and salt over a double boiler until thickened before whipped cold heavy cream is folded in. " +
                "Then it's wrapped, covered, and frozen! Easy, luxurious, and sure to please guests--and no ice cream machine is necessary"));
        addItem(new DummyItem("2", "Air Fryer Chicken Thighs", "These juicy chicken thighs are done in under 30 minutes and the air fryer makes it so easy!"));
        addItem(new DummyItem("3", "Butter Swim Biscuits", "\"These fluffy biscuits are literally swimming in butter! This biscuit-making method gives you the richest and tastiest biscuits ever!"));
        addItem(new DummyItem("4", "Sourdough Blueberry Muffins", "\"Slightly dense and bursting with blueberries. I've used unfed sourdough starter discard in this recipe but active sourdough can also be used. Muffins made with active sourdough will be slightly fluffier."));
        addItem(new DummyItem("5", "Grilled Italian Sausage with Peppers and Onions", "Italian sausage, bell peppers, and onions made easy on the grill. You can also serve the sausage in hot dog buns and finely chop the veggies once grilled as a relish. I like to add a squirt of mustard when I serve them this way."));
        addItem(new DummyItem("6", "Easy No-Bake Strawberry Ice Cream Cake", "It's hard to find a summer dessert easier and more refreshing than this combination of strawberry ice cream and a purchased 10-inch angel food cake! Layers of cake and ice cream, frosted with a purchased frozen whipped topping, are stored in the freezer until you are ready to garnish and slice. This should keep, covered, in the freezer for a week or two. I've never been able to find out exactly how long it will store, because it's usually gone in a few days!"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}