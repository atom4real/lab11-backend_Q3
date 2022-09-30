package se331.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import se331.rest.dao.AuctionDao;
import se331.rest.dao.BidDao;
import se331.rest.entity.AuctionItem;
import se331.rest.entity.Bid;

@Service
public class AuctionServiceImpl implements AuctionService {
    @Autowired
    AuctionDao auctionDao;

    @Autowired
    BidDao bidDao;
    @Override
    public Integer getAuctionSize() {
        return auctionDao.getAuctionSize();
    }

    @Override
    public Page<AuctionItem> getAuctions(Integer pageSize, Integer page) {
        return auctionDao.getAuctions(pageSize,page);
    }

    @Override
    public AuctionItem getAuction(Long id) {
        return auctionDao.getAuction(id);
    }


    @Override
    public Page<AuctionItem> getAuctions(String description, Pageable pageable) {
        return auctionDao.getAuction(description, pageable);
    }

    @Override
    public Page<AuctionItem> getAuctions(Integer value ,Pageable pageable) {
        return auctionDao.getAuction(value, pageable);
    }
    @Override
    @Transactional
    public AuctionItem save(AuctionItem auctionItem) {
//        Bid bid = bidDao.findById(auctionItem.getSuccessfulBid().getId()).orElse(null);
//        auctionItem.setSuccessfulBid(bid);
//                bid.setItem(auctionItem);
        return auctionDao.save(auctionItem);
    }
}
