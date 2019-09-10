package other.collection.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {
        Map<Integer, String> map2 = new TreeMap<>();
        map2.put(90, "sun");
        map2.put(57, "li");
        map2.put(91, "hu");
        for (Map.Entry<Integer, String> data : map2.entrySet()) {
            System.out.println(data.toString());
        }
        Map<User, String> map = new TreeMap<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getScore() - o2.getScore();
            }
        });
        map.put(new User(5, 90), "sun");
        map.put(new User(2, 57), "li");
        map.put(new User(3, 91), "hu");
        for (Map.Entry<User, String> user : map.entrySet()) {
            System.out.println(user.getKey().getId() + " " + user.getKey().getScore() + "=" + user.getValue());
        }
    }
}

class User {
    int id;
    int score;

    public User(int id, int score) {
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
