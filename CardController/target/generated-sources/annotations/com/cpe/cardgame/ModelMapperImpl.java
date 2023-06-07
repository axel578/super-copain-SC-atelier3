package com.cpe.cardgame;

import com.cpe.cardgame.entity.Card;
import fr.dtoin.CardIn;
import fr.dtoout.CardOut;
import fr.viewmodel.CardForm;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-07T21:32:04+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
public class ModelMapperImpl implements ModelMapper {

    @Override
    public Card convert(CardIn user) {
        if ( user == null ) {
            return null;
        }

        Card card = new Card();

        card.setAffinity( user.getAffinity() );
        card.setAttack( user.getAttack() );
        card.setDefence( user.getDefence() );
        card.setDescription( user.getDescription() );
        card.setEnergy( user.getEnergy() );
        card.setFamily( user.getFamily() );
        card.setHp( user.getHp() );
        card.setId( user.getId() );
        card.setImgUrl( user.getImgUrl() );
        card.setName( user.getName() );
        card.setOriginalHp( user.getOriginalHp() );
        card.setPrice( user.getPrice() );
        card.setSmallImgUrl( user.getSmallImgUrl() );
        card.setToSell( user.getToSell() );
        card.setUserId( user.getUserId() );

        return card;
    }

    @Override
    public Card convert(CardOut user) {
        if ( user == null ) {
            return null;
        }

        Card card = new Card();

        card.setAffinity( user.getAffinity() );
        card.setAttack( user.getAttack() );
        card.setDescription( user.getDescription() );
        card.setEnergy( user.getEnergy() );
        card.setFamily( user.getFamily() );
        card.setHp( user.getHp() );
        card.setId( user.getId() );
        card.setImgUrl( user.getImgUrl() );
        card.setName( user.getName() );
        card.setOriginalHp( user.getOriginalHp() );
        card.setPrice( user.getPrice() );
        card.setSmallImgUrl( user.getSmallImgUrl() );
        card.setToSell( user.getToSell() );
        card.setUserId( user.getUserId() );

        return card;
    }

    @Override
    public Card convert(CardForm user) {
        if ( user == null ) {
            return null;
        }

        Card card = new Card();

        card.setAffinity( user.getAffinity() );
        card.setAttack( user.getAttack() );
        card.setDefence( user.getDefence() );
        card.setDescription( user.getDescription() );
        card.setEnergy( user.getEnergy() );
        card.setFamily( user.getFamily() );
        card.setHp( user.getHp() );
        card.setId( user.getId() );
        card.setImgUrl( user.getImgUrl() );
        card.setName( user.getName() );
        card.setPrice( user.getPrice() );
        card.setSmallImgUrl( user.getSmallImgUrl() );
        card.setToSell( user.getToSell() );
        card.setUserId( user.getUserId() );

        return card;
    }

    @Override
    public CardIn convertFormToIn(CardForm user) {
        if ( user == null ) {
            return null;
        }

        CardIn cardIn = new CardIn();

        cardIn.setAffinity( user.getAffinity() );
        cardIn.setAttack( user.getAttack() );
        cardIn.setDefence( user.getDefence() );
        cardIn.setDescription( user.getDescription() );
        cardIn.setEnergy( user.getEnergy() );
        cardIn.setFamily( user.getFamily() );
        cardIn.setHp( user.getHp() );
        cardIn.setId( user.getId() );
        cardIn.setImgUrl( user.getImgUrl() );
        cardIn.setName( user.getName() );
        cardIn.setPrice( user.getPrice() );
        cardIn.setSmallImgUrl( user.getSmallImgUrl() );
        cardIn.setToSell( user.getToSell() );
        cardIn.setUserId( user.getUserId() );

        return cardIn;
    }

    @Override
    public CardOut convertFormToOut(CardForm user) {
        if ( user == null ) {
            return null;
        }

        CardOut cardOut = new CardOut();

        cardOut.setAffinity( user.getAffinity() );
        cardOut.setAttack( user.getAttack() );
        cardOut.setDescription( user.getDescription() );
        cardOut.setEnergy( user.getEnergy() );
        cardOut.setFamily( user.getFamily() );
        cardOut.setHp( user.getHp() );
        cardOut.setId( user.getId() );
        cardOut.setImgUrl( user.getImgUrl() );
        cardOut.setName( user.getName() );
        cardOut.setPrice( user.getPrice() );
        cardOut.setSmallImgUrl( user.getSmallImgUrl() );
        cardOut.setToSell( user.getToSell() );
        cardOut.setUserId( user.getUserId() );

        return cardOut;
    }

    @Override
    public CardForm convert(Card user) {
        if ( user == null ) {
            return null;
        }

        CardForm cardForm = new CardForm();

        cardForm.setAffinity( user.getAffinity() );
        cardForm.setAttack( user.getAttack() );
        cardForm.setDefence( user.getDefence() );
        cardForm.setDescription( user.getDescription() );
        cardForm.setEnergy( user.getEnergy() );
        cardForm.setFamily( user.getFamily() );
        cardForm.setHp( user.getHp() );
        cardForm.setId( user.getId() );
        cardForm.setImgUrl( user.getImgUrl() );
        cardForm.setName( user.getName() );
        cardForm.setPrice( user.getPrice() );
        cardForm.setSmallImgUrl( user.getSmallImgUrl() );
        cardForm.setToSell( user.getToSell() );
        cardForm.setUserId( user.getUserId() );

        return cardForm;
    }

    @Override
    public CardIn convertToIn(Card user) {
        if ( user == null ) {
            return null;
        }

        CardIn cardIn = new CardIn();

        cardIn.setAffinity( user.getAffinity() );
        cardIn.setAttack( user.getAttack() );
        cardIn.setDefence( user.getDefence() );
        cardIn.setDescription( user.getDescription() );
        cardIn.setEnergy( user.getEnergy() );
        cardIn.setFamily( user.getFamily() );
        cardIn.setHp( user.getHp() );
        cardIn.setId( user.getId() );
        cardIn.setImgUrl( user.getImgUrl() );
        cardIn.setName( user.getName() );
        cardIn.setOriginalHp( user.getOriginalHp() );
        cardIn.setPrice( user.getPrice() );
        cardIn.setSmallImgUrl( user.getSmallImgUrl() );
        cardIn.setToSell( user.getToSell() );
        cardIn.setUserId( user.getUserId() );

        return cardIn;
    }

    @Override
    public CardOut convertToOut(Card user) {
        if ( user == null ) {
            return null;
        }

        CardOut cardOut = new CardOut();

        cardOut.setAffinity( user.getAffinity() );
        cardOut.setAttack( user.getAttack() );
        cardOut.setDescription( user.getDescription() );
        cardOut.setEnergy( user.getEnergy() );
        cardOut.setFamily( user.getFamily() );
        cardOut.setHp( user.getHp() );
        cardOut.setId( user.getId() );
        cardOut.setImgUrl( user.getImgUrl() );
        cardOut.setName( user.getName() );
        cardOut.setOriginalHp( user.getOriginalHp() );
        cardOut.setPrice( user.getPrice() );
        cardOut.setSmallImgUrl( user.getSmallImgUrl() );
        cardOut.setToSell( user.getToSell() );
        cardOut.setUserId( user.getUserId() );

        return cardOut;
    }
}
