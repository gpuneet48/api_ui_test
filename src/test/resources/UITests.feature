Feature: UI Tests

@browser
Scenario: All 100 results are displayed
  Given :User opens base url
  Then : 100 results are displayed

@browser
Scenario: Verify Watchlist
 Given :User opens base url
 When :Add some random cryptocurrencies to watchlist
 Then :Open the watchlist in a different tab
 Then :Verify the currencies selected are added to the watchlist