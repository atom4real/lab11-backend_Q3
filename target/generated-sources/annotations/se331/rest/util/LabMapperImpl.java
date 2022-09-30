package se331.rest.util;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import se331.rest.entity.AuctionItem;
import se331.rest.entity.AuctionItemBidSuccessDTO;
import se331.rest.entity.AuctionItemDTO;
import se331.rest.entity.Bid;
import se331.rest.entity.BidDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-30T09:45:48+0700",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.4.1 (Eclipse Adoptium)"
)
public class LabMapperImpl implements LabMapper {

    @Override
    public AuctionItemDTO getAuctionDto(AuctionItem auctionItem) {
        if ( auctionItem == null ) {
            return null;
        }

        AuctionItemDTO.AuctionItemDTOBuilder auctionItemDTO = AuctionItemDTO.builder();

        auctionItemDTO.id( auctionItem.getId() );
        auctionItemDTO.description( auctionItem.getDescription() );
        auctionItemDTO.type( auctionItem.getType() );
        auctionItemDTO.successfulBid( bidToAuctionItemBidSuccessDTO( auctionItem.getSuccessfulBid() ) );
        auctionItemDTO.bids( getBidDto( auctionItem.getBids() ) );

        return auctionItemDTO.build();
    }

    @Override
    public List<AuctionItemDTO> getAuctionDto(List<AuctionItem> auctionItems) {
        if ( auctionItems == null ) {
            return null;
        }

        List<AuctionItemDTO> list = new ArrayList<AuctionItemDTO>( auctionItems.size() );
        for ( AuctionItem auctionItem : auctionItems ) {
            list.add( getAuctionDto( auctionItem ) );
        }

        return list;
    }

    @Override
    public BidDTO getBidDto(Bid bid) {
        if ( bid == null ) {
            return null;
        }

        BidDTO.BidDTOBuilder bidDTO = BidDTO.builder();

        bidDTO.id( bid.getId() );
        bidDTO.amount( bid.getAmount() );
        bidDTO.dateTime( bid.getDateTime() );

        return bidDTO.build();
    }

    @Override
    public List<BidDTO> getBidDto(List<Bid> bids) {
        if ( bids == null ) {
            return null;
        }

        List<BidDTO> list = new ArrayList<BidDTO>( bids.size() );
        for ( Bid bid : bids ) {
            list.add( getBidDto( bid ) );
        }

        return list;
    }

    protected AuctionItemBidSuccessDTO bidToAuctionItemBidSuccessDTO(Bid bid) {
        if ( bid == null ) {
            return null;
        }

        AuctionItemBidSuccessDTO.AuctionItemBidSuccessDTOBuilder auctionItemBidSuccessDTO = AuctionItemBidSuccessDTO.builder();

        auctionItemBidSuccessDTO.id( bid.getId() );
        auctionItemBidSuccessDTO.amount( bid.getAmount() );
        auctionItemBidSuccessDTO.dateTime( bid.getDateTime() );

        return auctionItemBidSuccessDTO.build();
    }
}
