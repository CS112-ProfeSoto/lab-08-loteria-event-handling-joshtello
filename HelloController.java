package cs112.lab08;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class HelloController {
    public Label cardLabel;
    @FXML
    private ImageView cardImage;
    @FXML
    private Button nextButton;

    private List<LoteriaCard> cards;
    private Random random = new Random();
    @FXML
    public void initialize() {
        cards = new ArrayList<>();
        LoteriaCard welcomeCard = new LoteriaCard("Click the button to randomly draw a card", "0.png", 0);
        showCard(welcomeCard);
        cards.add(new LoteriaCard("Las matematicas", "1.png", 1));
        cards.add(new LoteriaCard("Las ciencias", "2.png", 2));
        cards.add(new LoteriaCard("La Tecnología", "8.png", 8));
        cards.add(new LoteriaCard("La ingeniería", "9.png", 9));


    nextButton.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {


        public void handle(javafx.event.ActionEvent event) {
            int index = random.nextInt(cards.size());
            LoteriaCard card = cards.get(index);

            cardLabel.setText(card.getCardName());
            cardImage.setImage(card.getImage());
        }
    });
    }
    private void showCard(LoteriaCard card) {
        cardLabel.setText(card.getCardName());
        cardImage.setImage(card.getImage());
    }
    }