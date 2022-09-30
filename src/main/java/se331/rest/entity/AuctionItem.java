package se331.rest.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuctionItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    Long id;
    String description;
    String type;
    @OneToMany(mappedBy = "item")
    @Builder.Default
    List<Bid> bids = new ArrayList<>();
    @OneToOne
    Bid successfulBid;

}
