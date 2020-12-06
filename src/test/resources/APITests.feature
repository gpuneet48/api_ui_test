#1. Retrieve the ID of bitcoin (BTC), usd tether (USDT), and Ethereum (ETH), using the
#/cryptocurrency/map call.
#2. Once you have retrieved the IDs of these currencies, convert them to Bolivian Boliviano,
#using the /tools/price-conversion call.

#
#1. Retrieve the first 10 currencies from the cryptocurrency/info call (ID 1, 2, 3 … 10).
#2. Check which currencies have the mineable tag associated with them.
#3. Verify that the correct cryptocurrencies have been printed out.


Feature: API Tests

  Scenario: Retrieve BTC,USDT and ETH IDs and convert them to Bolivian Boliviano
    Given :IDs are retrieved
    Then :Convert them to bolivian Boliviano

  Scenario: Verify Ethereum details
    Then :Fetch and validate currency info

  Scenario: Get first ten currencies info and validate them
    Given :Fetch first ten  currency info
    Then :Verify that currencies have 'mineable' tag
    And :Verify currencies names are present in response