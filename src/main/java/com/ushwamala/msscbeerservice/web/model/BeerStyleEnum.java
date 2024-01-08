package com.ushwamala.msscbeerservice.web.model;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum BeerStyleEnum {

    PILSNER(1),
    ALE(2),
    LAGER(3),
    STOUT(4),
    WHEAT(5),
    PORTER(6),
    IPA(7),
    PALE_ALE(8),
    SAISON(9);

    private final int beerStyleCode;

}
