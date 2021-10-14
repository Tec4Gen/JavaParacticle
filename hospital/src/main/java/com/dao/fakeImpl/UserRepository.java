package com.dao.fakeImpl;

import com.entities.Card;
import com.entities.User;
import lombok.var;

import java.util.ArrayList;

public class UserRepository implements com.dao.UserRepository {

    private static ArrayList<User> users;

    static {
        users = new ArrayList<>();

        var medicalCard = new Card(1);
        users.add(new User(0, "Петров", "Петр", "Петрович", "user1@hosp.com", "123", "user1", medicalCard));
        medicalCard = new Card(2);
        users.add(new User(0, "Емельянов", "Емельян", "Емельянович", "user2@hosp.com", "123", "user2", medicalCard));
    }


    @Override
    public User Add(User user) {
        var id = users.stream().mapToInt(v -> v.getId()).max().getAsInt() + 1;
        user.setId(id);

        users.add(user);
        return user;
    }

    @Override
    public User Update(User user) {
        return null;
    }

    @Override
    public User RemoveById(int id) {
        var result = GetById(id);

        if(result != null) {
            if(users.remove(result))
            {
                return result;
            }

            return null;
        }

        return null;
    }

    @Override
    public User GetById(int id) {
        return users.stream()
                .filter(x-> x.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public ArrayList<User> GetAll() {
        return users;
    }
}
