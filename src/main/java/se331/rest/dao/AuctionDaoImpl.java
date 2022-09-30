package se331.rest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import se331.rest.entity.AuctionItem;
import se331.rest.repository.AuctionRepository;

@Profile("db")
@Repository
public class AuctionDaoImpl implements  AuctionDao{
    @Autowired
    AuctionRepository auctionRepository;

    @Override
    public Integer getAuctionSize() {
        return Math.toIntExact(auctionRepository.count());
    }

    @Override
    public Page<AuctionItem> getAuctions(Integer pageSize, Integer page) {
        return auctionRepository.findAll(PageRequest.of(page-1,pageSize));
    }

    @Override
    public AuctionItem getAuction(Long id) {
        return auctionRepository.findById(id).orElse(null);
    }

    @Override
    public Page<AuctionItem> getAuction(String description, Pageable page) {
        return auctionRepository.findByDescriptionContainingIgnoreCase(description,page);
    }

    @Override
    public Page<AuctionItem> getAuction(Integer value, Pageable page) {
        return auctionRepository.findBySuccessfulBidAmountLessThan(value,page);
    }

    @Override
    public AuctionItem save(AuctionItem auctionItem) {
        return auctionRepository.save(auctionItem);
    }
}
