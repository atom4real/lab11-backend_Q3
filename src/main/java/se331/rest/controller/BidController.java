package se331.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import se331.rest.entity.AuctionItem;
import se331.rest.service.AuctionService;
import se331.rest.service.BidService;
import se331.rest.util.LabMapper;

@RestController
public class BidController {
    @Autowired
    BidService bidService;
    @GetMapping("/bids")
    ResponseEntity<?> getBids(){
        return ResponseEntity.ok(LabMapper.INSTANCE.getBidDto(bidService.getAllBid()));
    }
}
