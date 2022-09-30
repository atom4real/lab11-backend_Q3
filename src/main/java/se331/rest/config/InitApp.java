package se331.rest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import se331.rest.entity.AuctionItem;
import se331.rest.entity.Bid;
import se331.rest.repository.AuctionRepository;
import se331.rest.repository.BidRepository;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Component
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    AuctionRepository auctionRepository;

    @Autowired
    BidRepository bidRepository;

    @Override
    @Transactional
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
    Bid bid1,bid2,bid3,bid4,bid5,bid6,bid7,bid8,bid9,bid10,bid11,bid12,bid13,bid14,bid15;
    bid1 = bidRepository.save(Bid.builder()
            .amount(1)
            .dateTime(LocalDateTime.now())
            .build());
        bid2 = bidRepository.save(Bid.builder()
                .amount(2)
                        .dateTime(LocalDateTime.now())
                .build());
        bid3 = bidRepository.save(Bid.builder()
                .amount(3)
                .dateTime(LocalDateTime.now())
                .build());
        bid4 = bidRepository.save(Bid.builder()
                .amount(4)
                .dateTime(LocalDateTime.now())
                .build());
        bid5 = bidRepository.save(Bid.builder()
                .amount(5)
                .dateTime(LocalDateTime.now())
                .build());

        bid6 = bidRepository.save(Bid.builder()
                .amount(6)
                .dateTime(LocalDateTime.now())
                .build());
        bid7 = bidRepository.save(Bid.builder()
                .amount(7)
                .dateTime(LocalDateTime.now())
                .build());
        bid8 = bidRepository.save(Bid.builder()
                .amount(8)
                .dateTime(LocalDateTime.now())
                .build());
        bid9 = bidRepository.save(Bid.builder()
                .amount(9)
                .dateTime(LocalDateTime.now())
                .build());
        bid10 = bidRepository.save(Bid.builder()
                .amount(10)
                .dateTime(LocalDateTime.now())
                .build());

        bid11 = bidRepository.save(Bid.builder()
                .amount(11)
                .dateTime(LocalDateTime.now())
                .build());
        bid12 = bidRepository.save(Bid.builder()
                .amount(12)
                .dateTime(LocalDateTime.now())
                .build());
        bid13 = bidRepository.save(Bid.builder()
                .amount(13)
                .dateTime(LocalDateTime.now())
                .build());
        bid14 = bidRepository.save(Bid.builder()
                .amount(14)
                .dateTime(LocalDateTime.now())
                .build());
        bid15 = bidRepository.save(Bid.builder()
                .amount(15)
                .dateTime(LocalDateTime.now())
                .build());

        AuctionItem auctionItem;
        auctionItem = auctionRepository.save(
                AuctionItem.builder()
                        .description("Car")
                        .type("Sport")
                        .build()
        );

        bid1.setItem(auctionItem);
        bid2.setItem(auctionItem);
        bid3.setItem(auctionItem);
        auctionItem.getBids().add(bid1);
        auctionItem.getBids().add(bid2);
        auctionItem.getBids().add(bid3);
        
        auctionItem.setSuccessfulBid(bid3);

        auctionItem = auctionRepository.save(
                AuctionItem.builder()
                        .description("Car")
                        .type("Second hand")
                        .build()
        );

        bid4.setItem(auctionItem);
        bid5.setItem(auctionItem);
        bid6.setItem(auctionItem);
        auctionItem.getBids().add(bid4);
        auctionItem.getBids().add(bid5);
        auctionItem.getBids().add(bid6);

        auctionItem.setSuccessfulBid(bid6);

        auctionItem = auctionRepository.save(
                AuctionItem.builder()
                        .description("Car")
                        .type("Off road")
                        .build()
        );
        bid7.setItem(auctionItem);
        bid8.setItem(auctionItem);
        bid9.setItem(auctionItem);
        auctionItem.getBids().add(bid7);
        auctionItem.getBids().add(bid8);
        auctionItem.getBids().add(bid9);

        auctionItem.setSuccessfulBid(bid9);
        auctionItem = auctionRepository.save(
                AuctionItem.builder()
                        .description("Monitor")
                        .type("MSI")
                        .build()
        );
        bid10.setItem(auctionItem);
        bid11.setItem(auctionItem);
        bid12.setItem(auctionItem);
        auctionItem.getBids().add(bid10);
        auctionItem.getBids().add(bid11);
        auctionItem.getBids().add(bid12);

        auctionItem.setSuccessfulBid(bid12);
        auctionItem = auctionRepository.save(
                AuctionItem.builder()
                        .description("Monitor")
                        .type("Logitech")
                        .build()
        );
        bid13.setItem(auctionItem);
        bid14.setItem(auctionItem);
        bid15.setItem(auctionItem);
        auctionItem.getBids().add(bid13);
        auctionItem.getBids().add(bid14);
        auctionItem.getBids().add(bid15);

        auctionItem.setSuccessfulBid(bid15);
        auctionItem = auctionRepository.save(
                AuctionItem.builder()
                        .description("Toy")
                        .type("Lego")
                        .build()
        );
    }
}
