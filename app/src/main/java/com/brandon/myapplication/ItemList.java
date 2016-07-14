package com.brandon.myapplication;

import android.os.Parcel;

import com.google.android.gms.vision.barcode.Barcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by bs2690 on 7/8/2016.
 */
public class ItemList {

    private List<Item> listData = new ArrayList<Item>();
    public ItemList(){
        prepareListData();
    }

    private void prepareListData() {


//        Other Category
        listData.add(new Item("Pond", "It is a water source for trees and animals \n" +
                "While ponds have always been a haven for beautiful fish, such as Koi and goldfish, they also attract and provide a sanctuary of breeding for indigenous wildlife like dragonflies, frogs, turtles and birds. " +
                " Baby frogs and toads (known as tadpoles) are generally a desirable pond inhabitant for their algae-eating habits. Adult toads are also beneficial for their aid in controlling insects.\n",Category.OTHER,"pond"));
        listData.add(new Item("Edge", "The boundary of two habitats or community structures.  Natural features stablize the border location.  Animals that colonize tend to travel between habitats such as white tailed and mule deer, cottontail rabbits, blue jays and robins.  " +
                "Sometimes the edge becomes overgrown or adveresly affected by human activity and can result in abiotic and biotic conditions and threaten the original ecosystem.  Dragonflies eat mosquitoes but have trouble surviving around edges of human community thus trails in these type areas have more mosquitioes.",Category.OTHER,""));
        listData.add(new Item("Spillway", " A spillway is a structure used to provide the controlled release of flows from a dam or levee into a downstream area, typically being the river that was dammed.",Category.OTHER,""));
        listData.add(new Item("Gas Line", "Three major types of pipelines are found along the transportation route bringing natural gas from the point of production to the point of use.\n" +
                "Natural gas is delivered directly to homes and businesses through local distribution lines from local distribution companies. Large distribution lines, called mains, move the gas close to cities. " +
                "These main lines, along with the much smaller service lines that travel to homes and businesses account for the vast majority of the nation’s 2.4-million- mile underground pipeline system.\n" +
                "Natural gas supplies nearly one-fourth or 22 percent of all of the energy used in the United States. \n",Category.OTHER,""));

//        Plants Category
        listData.add(new Item("BlackBerry", "Blackberry leaves are food for certain caterpillars; some grazing mammals, especially deer, are also very fond of the leaves.  Other animals that eat blackberries are Wild Turkey, Common Crow, Blue Jay and Northern Mockingbird.\n" +
                "Blackberries have been eaten by humans over thousands of years.  It has significant contents of dietary fiber, vitamin C, and vitamin K. \n" +
                "Blackberry's fruit is effective against the development of cancer including lung cancer, colon cancer and esophageal cancer.  They have a high rate of survival after fires.\n" +
                "This tree attracts wood ducks, bobwhites, purples finches, pine grosbeaks, fox squirrels, rabbits, beavers, mice, and porcupines. \n" +
                "It is used to make things like baseball bats, hockey sticks, and furniture.\n",Category.PLANTS,""));
        listData.add(new Item("Poison Ivy", "(non vine) At least 60 species of bird are reported to eat the fruits.\n" +
                "Poison ivy can be either a trailing vine that sends up short, erect shoots, or a climbing vine that ascends trees and is “hairy” with aerial rootlets.  Don't touch, it can cause skin irritations and allergic reactions.\n" +
                "(vine) Vines growing on the trunk of a tree become firmly attached through numerous aerial rootlets. The vines develop adventitious roots.  Whenever Eastern Poison ivy climbs, it uses little hairy roots to attach to surfaces. When there are no leaves climbing poison ivy can almost always be identified by the hairy roots.\n" +
                "The leaves branch off left, then right, not straight across from each other.  Vines can be six inches thick, and climb over 100 feet tall.\n",Category.PLANTS,""));
        listData.add(new Item("Honey Suckle", "In addition to producing sweet-smelling, trumpet-shaped flowers, honeysuckle plants also produce black, red or blue berries. While the nectar in the bottom of honeysuckle flowers can be consumed, the berries are poisonous and should not be eaten.\n" +
                "White-tailed deer, Wild turkeys, northern bobwhite, and various songbirds utilize Japanese honeysuckle as food, particularly during winter when other food may be scarce. Its persistent leaves shield fruit from sleet when other food is glazed with ice.\n" +
                "They are used for medical use around the world.  It is mostly the flowers and leaves that are used for their healing properties.  It reduces fever with its cooling properties, best used for such ailments as sore throats, swollen eyes, headaches, etc. " +
                " Because it is a natural antibiotic, honeysuckle can also be used to treat infections caused by staphylococcal or streptococcal bacteria.  " +
                "Honeysuckle has been found useful in alleviating rashes ranging from skin diseases to poison oak\n",Category.PLANTS,"honeysuckle"));
        listData.add(new Item("Virginia Creeper", "The berries of this plant are eaten by many animals especially birds. Animals such as mice, skunks, chipmunks, squirrels, cattle and deer will munch on the leaves and stems.  This plant provides great cover for small animals because of is thick foliage. " +
                "The vines provide birds with perches, nesting places and leaf surfaces to find food. \n" +
                "Virginia creeper is used as a ground cover to control soil erosion in shaded areas and on slopes. \n" +
                "The bark and berries have been used in domestic medicine as a tonic, expectorant, and remedy.\n" +
                "Virginia creeper is often confused with eastern poison ivy, a clear distinction between the species is that eastern poison ivy has three leaflets and Virginia creeper has five leaflets.\n",Category.PLANTS,""));

//        Trees Category
        listData.add(new Item("Red Oak", "Red oak wood is one of the main type of wood used for timber in the eastern United States. Because of its ability to tolerate many conditions, it is planted in many cities and urban areas. It is often planted for landscaping.\n" +
                "A very large Northern Red Oak is located in Ashford, Connecticut the trunk's diameter is 8 m (26 ft) \n" +
                "Most species of oaks live over 200 years. There are certain trees that can survive over a thousand years.\n",Category.TREES,"redoak"));
        listData.add(new Item("Young Sweetgum", "A distinctive feature of the tree is the peculiar appearance of its small branches and twigs. The bark attaches itself to these in plates edgewise instead of laterally, and a piece of the leafless branch takes on a reptilian form, the tree is sometimes called Alligator-wood. \n" +
                "Sweet gum trees also fix nitrogen in the soil and improve its fertility. \n" +
                "It provides cover for forest animals, including Eastern gray squirrels, wood ducks, white-tailed deer, mourning doves, green darners, Carolina chickadees and beavers. Seed-rich sweet gum pods make food for squirrels, chipmunks and birds. \n" +
                "Boiled and cooled sap from sweet gum trees makes a balm. This medicinally potent balm has been used to treat various ailments, including skin problems.  Native American Cherokee tribes applied resin from the tree to treat wounds.\n",Category.TREES,""));
        listData.add(new Item("Dead tree", "Standing dead trees, called snags, provide birds and mammals with shelter to raise young and raptors with unobstructed vantage points.  Only 30 bird species are capable of making their own nest cavities in trees. The pileated woodpecker is an example.  " +
                "Another 80 animal species depend upon previously excavated or natural tree holes for their nests.\n" +
                "The insulation of a tree trunk home allows wildlife to survive high summer and low winter temperature extremes. Tree cavities and loose bark are used by many animals to store their food supplies, while insects living in dead wood eat thousands of forest pests which can harm living trees. " +
                "Woodpeckers and creepers feast on the wood-eating insects and provide \"sawdust\" for ants to process.\n" +
                "When fallen trees fall their logs rot and they store water and provide nutrients for the growth of the forest.  They provide homes to birds and are good for firewood.  When they fall into or near water and wetlands, fish and amphibians hide under and around dead wood. This aquatic \"structure\" provides important shelter for juvenile salmon, steelhead, char and trout. " +
                "Without woody debris in our rivers and streams, these watersheds can't provide adequate habitat for many native fish species.",Category.TREES,""));
        listData.add(new Item("Black Locust", "It is not heavily harvested and no varieties or hybrids have been created. The wood of the Winged elm is however put to good use in making furniture, particularly when curved pieces are required. " +
                "The wood is quite strong and does not split easily. The wood exhibits interesting patterns, making it useful as flooring. The main reason that there is not more of a commercial market for the Winged elm is probably because there are so many other hardwood species.",Category.TREES,""));
        listData.add(new Item("Young Ash", "Seeds are eaten by several species of birds. The bark is occasionally food for rabbits, beavers, and porcupines. \n" +
                "Cavity excavating and nesting birds often use White Ash. \n" +
                "This tree attracts wood ducks, bobwhites, purples finches, pine grosbeaks, fox squirrels, rabbits, beavers, mice, and porcupines. \n" +
                "It is used to make things like baseball bats, hockey sticks, and furniture.\n",Category.TREES,""));
        listData.add(new Item("Winged Elm", "It is not heavily harvested and no varieties or hybrids have been created. The wood of the Winged elm is however put to good use in making furniture, particularly when curved pieces are required. " +
                "The wood is quite strong and does not split easily. The wood exhibits interesting patterns, making it useful as flooring. The main reason that there is not more of a commercial market for the Winged elm is probably because there are so many other hardwood species.",Category.TREES,""));
        listData.add(new Item("Cedar", "Cedar trees are evergreen, green all seasons. The wood has a pleasant and distinctive scent.  It has natural oils in the wood that are toxic to insects and fungus.  Cedar have been important to humans for hundreds of years. Native American use it to make canoes and other boats.  " +
                "It was also used to make weapons, boxes, bowls, and baskets.  " +
                "The bark was used to make blankets, capes, costumes and a source of fuel.  Today, cedar is used for making pencils and other tools.  The branches make an excellent location for bird and squirrel nests.",Category.TREES,""));
        listData.add(new Item("Willow Oak", "It is used primarily as an ornamental tree, forming a rounded canopy, it is one of the best oaks for gardens, parks and to provide shade along streets.  The wood is used for pulp and paper production, but also for lumber; it is often marketed as \"red oak\" wood.\n" +
                "This oak species provides acorn food to ducks, squirrels, deer and turkeys as well as blue jays and redheaded woodpeckers. Grackles, flickers, mice and flying squirrels utilize the tree for nesting or general habitat.\n",Category.TREES,""));
        listData.add(new Item("White Oak", "The acorns are much less bitter than the acorns of red oaks. They are small relative to most oaks, but are a valuable wildlife food, notably for turkeys, wood ducks, pheasants, grackles, jays, nuthatches, thrushes, woodpeckers, rabbits, squirrels, and deer. \n" +
                "The trees also offer shade and shelter, leaves and twigs for building nests and even for eating, and participate in the globe’s exchange of oxygen and carbon dioxide as well as in how water moves through an ecosystem.\n",Category.TREES,""));
        listData.add(new Item("Shagbark", "The nuts are edible with an excellent flavor, and are a popular food among people and squirrels alike. They are unsuitable for commercial or orchard production due to the long time it takes for a tree to produce sizable crops and unpredictable output from year to year.\n" +
                "Some animals, like Indiana bats, make their homes in snug crevices beneath the loose bark.\n",Category.TREES,""));
        listData.add(new Item("Sugar Maple", "Besides providing maple syrup, it yields a wood of high grade. The wood is hard, strong, close-grained, and tough, with a fine, satiny surface. It is in great demand for flooring, veneer, interior finish, furniture, and as a fuel wood of the best quality. \n" +
                "One particular species of bird called the Leaf Flycatcher suffers when sugar maples in a particular area are declining. This species of bird catches its food by picking up insects off of it leaves, so less leaves with insects residing on them for the bird to catch and eat create a food shortage.\n" +
                "It's leaf litter helps contribute to earthworms’ success. Earthworms are also important as it facilitates the breakdown of the leaf material.  They will take the leaf litter and break it down to its essential nutrients that the sugar maple can take up and reuse later. \n" +
                "The roots of the sugar maple also have important interactions with fungi in which it helps them to increase their water and nutrient absorption. It would not be able to grow to such large heights without this interaction. The fungi as well would not be able to grow as well.\n" +
                "White-tailed deer, moose, snowshoe hare, flying squirrels, lepidopertan larvae, and aphids are all animals that feed on the sugar maple seeds, buds, twigs, and leaves. Porcupines also consume the bark of the tree and can girdle the upper stem. Songbirds, woodpeckers, and cavity nesters nest in the sugar maple.\n" +
                "The maple syrup and sugar industry is an important part of the many agricultural economies in the Northeast. The earliest written accounts of maple sugaring were made in the early 1600s by European explores who observed Native Americans gathering maple sap.\n",Category.TREES,""));
        listData.add(new Item("May Apple", "The unripe green fruit is toxic. The ripened yellow fruit is edible in little amounts, though when consumed in large amounts the fruit is poisonous.  CAUTION: Do not eat the fruit until it is ripe. Ripe fruits are yellow and soft. Unripe fruits are greenish and not soft. " +
                "May apples are among the first plants to come up in the spring.\n" +
                "American Mandrake, or May Apple, is being tested as a possible treatment for cancer as it contains podophyllin, which has an antimiotic effect (it interferes with cell division and can thus prevent the growth of cells).  May Apple should only be used by professional herbalists. \n" +
                "The resin of May Apple, which is obtained from the root, is used in the treatment of warts.\n" +
                "The fully ripe fruit is eaten raw, cooked or made into jams, jellies, marmalades, and pies. It is very aromatic, and has a sweet peculiar but agreeable flavor. May Apple seeds and rind are not edible, said to be poisonous\n",Category.TREES,""));
        listData.add(new Item("Mature Green Ash", "The name White Ash derives from the glaucous undersides of the leaves. It is similar in appearance to the Green Ash, making identification difficult. The lower sides of the leaves of White Ash are lighter in color than their upper sides, and the outer surface of the twigs of White Ash may be flaky or peeling.  " +
                "Ash is unique from other trees because of the opposite branching and compound leaf.",Category.TREES,""));
    }

    public ArrayList<Item> getCategoryListData(String category) {
       ArrayList<Item> categoryListData = new ArrayList<>();
        for(Item i : listData){
            if(i.getCategory().toString().equalsIgnoreCase(category)){
                categoryListData.add(i);
            }
        }
        Collections.sort(categoryListData);
        return categoryListData;
    }
    public int getItemLocation(String barcode){
        for(int i =0; i < listData.size(); i++){
            if(listData.get(i).getBarcode().equalsIgnoreCase(barcode)){
                return i;
            }
        }
        return listData.size();
    }

    public Category getItemCategory(int position){
        return listData.get(position).getCategory();
    }
}
