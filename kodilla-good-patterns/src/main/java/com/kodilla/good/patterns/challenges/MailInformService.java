package com.kodilla.good.patterns.challenges;

public class MailInformService  implements InformationService{

    @Override
    public void inform(User user) {
        System.out.println(user.getUserName() + "!\nThank you for order.");
    }
}
