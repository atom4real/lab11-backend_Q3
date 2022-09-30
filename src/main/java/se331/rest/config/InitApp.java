package se331.rest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import se331.rest.entity.AuctionItem;
import se331.rest.entity.Bid;
import se331.rest.repository.AuctionRepository;
import se331.rest.repository.BidRepository;

import javax.transaction.Transactional;

public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    AuctionRepository auctionRepository;

    @Autowired
    BidRepository bidRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
//    Bid bid1,bid2,bid3;
//    bid1 = bidRepository.save(Bid.builder()
//            .amount(10)
//            .build());
//        bid2 = bidRepository.save(Bid.builder()
//                .amount(10)
//                .build());
//        bid3 = bidRepository.save(Bid.builder()
//                .amount(10)
//                .build());
//        AuctionItem auctionItem = null;
//        auctionItem =
        AuctionItem auctionItem;
        auctionItem = auctionRepository.save(
                AuctionItem.builder()
                        .description("Car")
                        .type("kkk")
                        .build()
        );
    }
}
