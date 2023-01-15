package com.admin.flightaware.controllers;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class ApiCall {
	
	//API Call to get list of flights
	public String fprices(String p1,String p2,String p3,String d) throws IOException, InterruptedException, ParseException
	{
		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("http://skyscanner.onrender.com/api/flights?origin="+p2+"&destination="+p3+"&currency=INR&departureDate="+d))
				.header("x-rapidapi-key", "1eac24282dmsh4267d042a087ad5p14cb43jsn151923014c16")
				.header("x-rapidapi-host", "skyscanner44.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		return response.body();
	  
	}
	public String dprices(String ctry,String curr,String p1,String p2,String p3,String d,String d2) throws IOException, InterruptedException, ParseException
	{
//		System.out.println("http://skyscanner.onrender.com/api/flights?origin="+p2+"&destination="+p3+"&currency=INR&departureDate="+d);
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("http://skyscanner.onrender.com/api/datewiseflights?origin="+p2+"&destination="+p3+"&currency=INR&departureDate="+d+"&returnDate="+d2))
				.header("x-rapidapi-key", "1eac24282dmsh4267d042a087ad5p14cb43jsn151923014c16")
				.header("x-rapidapi-host", "skyscanner44.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		return response.body();
		
	}
	public String rts(String ctry,String curr,String p1,String p2,String p3,String d) throws IOException, InterruptedException, ParseException
	{
				HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("http://skyscanner.onrender.com/api/routes?origin="+p2+"&destination="+p3+"&currency=INR&departureDate="+d))
				.header("x-rapidapi-key", "1eac24282dmsh4267d042a087ad5p14cb43jsn151923014c16")
				.header("x-rapidapi-host", "skyscanner44.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		return response.body();
		
	}
	public String curs() throws IOException, InterruptedException{
		
		return "{\"currencies\":[{\"name\":\"Afghan Afghani\",\"code\":\"AFA\",\"symbol\":\"؋\"},{\"name\":\"Albanian Lek\",\"code\":\"ALL\",\"symbol\":\"Lek\"},{\"name\":\"Algerian Dinar\",\"code\":\"DZD\",\"symbol\":\"دج\"},{\"name\":\"Angolan Kwanza\",\"code\":\"AOA\",\"symbol\":\"Kz\"},{\"name\":\"Argentine Peso\",\"code\":\"ARS\",\"symbol\":\"$\"},{\"name\":\"Armenian Dram\",\"code\":\"AMD\",\"symbol\":\"֏\"},{\"name\":\"Aruban Florin\",\"code\":\"AWG\",\"symbol\":\"ƒ\"},{\"name\":\"Australian Dollar\",\"code\":\"AUD\",\"symbol\":\"$\"},{\"name\":\"Azerbaijani Manat\",\"code\":\"AZN\",\"symbol\":\"m\"},{\"name\":\"Bahamian Dollar\",\"code\":\"BSD\",\"symbol\":\"B$\"},{\"name\":\"Bahraini Dinar\",\"code\":\"BHD\",\"symbol\":\".د.ب\"},{\"name\":\"Bangladeshi Taka\",\"code\":\"BDT\",\"symbol\":\"৳\"},{\"name\":\"Barbadian Dollar\",\"code\":\"BBD\",\"symbol\":\"Bds$\"},{\"name\":\"Belarusian Ruble\",\"code\":\"BYR\",\"symbol\":\"Br\"},{\"name\":\"Belgian Franc\",\"code\":\"BEF\",\"symbol\":\"fr\"},{\"name\":\"Belize Dollar\",\"code\":\"BZD\",\"symbol\":\"$\"},{\"name\":\"Bermudan Dollar\",\"code\":\"BMD\",\"symbol\":\"$\"},{\"name\":\"Bhutanese Ngultrum\",\"code\":\"BTN\",\"symbol\":\"Nu.\"},{\"name\":\"Bitcoin\",\"code\":\"BTC\",\"symbol\":\"฿\"},{\"name\":\"Bolivian Boliviano\",\"code\":\"BOB\",\"symbol\":\"Bs.\"},{\"name\":\"Bosnia-Herzegovina Convertible Mark\",\"code\":\"BAM\",\"symbol\":\"KM\"},{\"name\":\"Botswanan Pula\",\"code\":\"BWP\",\"symbol\":\"P\"},{\"name\":\"Brazilian Real\",\"code\":\"BRL\",\"symbol\":\"R$\"},{\"name\":\"British Pound Sterling\",\"code\":\"GBP\",\"symbol\":\"£\"},{\"name\":\"Brunei Dollar\",\"code\":\"BND\",\"symbol\":\"B$\"},{\"name\":\"Bulgarian Lev\",\"code\":\"BGN\",\"symbol\":\"Лв.\"},{\"name\":\"Burundian Franc\",\"code\":\"BIF\",\"symbol\":\"FBu\"},{\"name\":\"Cambodian Riel\",\"code\":\"KHR\",\"symbol\":\"KHR\"},{\"name\":\"Canadian Dollar\",\"code\":\"CAD\",\"symbol\":\"$\"},{\"name\":\"Cape Verdean Escudo\",\"code\":\"CVE\",\"symbol\":\"$\"},{\"name\":\"Cayman Islands Dollar\",\"code\":\"KYD\",\"symbol\":\"$\"},{\"name\":\"CFA Franc BCEAO\",\"code\":\"XOF\",\"symbol\":\"CFA\"},{\"name\":\"CFA Franc BEAC\",\"code\":\"XAF\",\"symbol\":\"FCFA\"},{\"name\":\"CFP Franc\",\"code\":\"XPF\",\"symbol\":\"₣\"},{\"name\":\"Chilean Peso\",\"code\":\"CLP\",\"symbol\":\"$\"},{\"name\":\"Chinese Yuan\",\"code\":\"CNY\",\"symbol\":\"¥\"},{\"name\":\"Colombian Peso\",\"code\":\"COP\",\"symbol\":\"$\"},{\"name\":\"Comorian Franc\",\"code\":\"KMF\",\"symbol\":\"CF\"},{\"name\":\"Congolese Franc\",\"code\":\"CDF\",\"symbol\":\"FC\"},{\"name\":\"Costa Rican ColÃ³n\",\"code\":\"CRC\",\"symbol\":\"₡\"},{\"name\":\"Croatian Kuna\",\"code\":\"HRK\",\"symbol\":\"kn\"},{\"name\":\"Cuban Convertible Peso\",\"code\":\"CUC\",\"symbol\":\"$, CUC\"},{\"name\":\"Czech Republic Koruna\",\"code\":\"CZK\",\"symbol\":\"Kč\"},{\"name\":\"Danish Krone\",\"code\":\"DKK\",\"symbol\":\"Kr.\"},{\"name\":\"Djiboutian Franc\",\"code\":\"DJF\",\"symbol\":\"Fdj\"},{\"name\":\"Dominican Peso\",\"code\":\"DOP\",\"symbol\":\"$\"},{\"name\":\"East Caribbean Dollar\",\"code\":\"XCD\",\"symbol\":\"$\"},{\"name\":\"Egyptian Pound\",\"code\":\"EGP\",\"symbol\":\"ج.م\"},{\"name\":\"Eritrean Nakfa\",\"code\":\"ERN\",\"symbol\":\"Nfk\"},{\"name\":\"Estonian Kroon\",\"code\":\"EEK\",\"symbol\":\"kr\"},{\"name\":\"Ethiopian Birr\",\"code\":\"ETB\",\"symbol\":\"Nkf\"},{\"name\":\"Euro\",\"code\":\"EUR\",\"symbol\":\"€\"},{\"name\":\"Falkland Islands Pound\",\"code\":\"FKP\",\"symbol\":\"£\"},{\"name\":\"Fijian Dollar\",\"code\":\"FJD\",\"symbol\":\"FJ$\"},{\"name\":\"Gambian Dalasi\",\"code\":\"GMD\",\"symbol\":\"D\"},{\"name\":\"Georgian Lari\",\"code\":\"GEL\",\"symbol\":\"ლ\"},{\"name\":\"German Mark\",\"code\":\"DEM\",\"symbol\":\"DM\"},{\"name\":\"Ghanaian Cedi\",\"code\":\"GHS\",\"symbol\":\"GH₵\"},{\"name\":\"Gibraltar Pound\",\"code\":\"GIP\",\"symbol\":\"£\"},{\"name\":\"Greek Drachma\",\"code\":\"GRD\",\"symbol\":\"₯, Δρχ, Δρ\"},{\"name\":\"Guatemalan Quetzal\",\"code\":\"GTQ\",\"symbol\":\"Q\"},{\"name\":\"Guinean Franc\",\"code\":\"GNF\",\"symbol\":\"FG\"},{\"name\":\"Guyanaese Dollar\",\"code\":\"GYD\",\"symbol\":\"$\"},{\"name\":\"Haitian Gourde\",\"code\":\"HTG\",\"symbol\":\"G\"},{\"name\":\"Honduran Lempira\",\"code\":\"HNL\",\"symbol\":\"L\"},{\"name\":\"Hong Kong Dollar\",\"code\":\"HKD\",\"symbol\":\"$\"},{\"name\":\"Hungarian Forint\",\"code\":\"HUF\",\"symbol\":\"Ft\"},{\"name\":\"Icelandic KrÃ³na\",\"code\":\"ISK\",\"symbol\":\"kr\"},{\"name\":\"Indian Rupee\",\"code\":\"INR\",\"symbol\":\"₹\"},{\"name\":\"Indonesian Rupiah\",\"code\":\"IDR\",\"symbol\":\"Rp\"},{\"name\":\"Iranian Rial\",\"code\":\"IRR\",\"symbol\":\"﷼\"},{\"name\":\"Iraqi Dinar\",\"code\":\"IQD\",\"symbol\":\"د.ع\"},{\"name\":\"Israeli New Sheqel\",\"code\":\"ILS\",\"symbol\":\"₪\"},{\"name\":\"Italian Lira\",\"code\":\"ITL\",\"symbol\":\"L,£\"},{\"name\":\"Jamaican Dollar\",\"code\":\"JMD\",\"symbol\":\"J$\"},{\"name\":\"Japanese Yen\",\"code\":\"JPY\",\"symbol\":\"¥\"},{\"name\":\"Jordanian Dinar\",\"code\":\"JOD\",\"symbol\":\"ا.د\"},{\"name\":\"Kazakhstani Tenge\",\"code\":\"KZT\",\"symbol\":\"лв\"},{\"name\":\"Kenyan Shilling\",\"code\":\"KES\",\"symbol\":\"KSh\"},{\"name\":\"Kuwaiti Dinar\",\"code\":\"KWD\",\"symbol\":\"ك.د\"},{\"name\":\"Kyrgystani Som\",\"code\":\"KGS\",\"symbol\":\"лв\"},{\"name\":\"Laotian Kip\",\"code\":\"LAK\",\"symbol\":\"₭\"},{\"name\":\"Latvian Lats\",\"code\":\"LVL\",\"symbol\":\"Ls\"},{\"name\":\"Lebanese Pound\",\"code\":\"LBP\",\"symbol\":\"£\"},{\"name\":\"Lesotho Loti\",\"code\":\"LSL\",\"symbol\":\"L\"},{\"name\":\"Liberian Dollar\",\"code\":\"LRD\",\"symbol\":\"$\"},{\"name\":\"Libyan Dinar\",\"code\":\"LYD\",\"symbol\":\"د.ل\"},{\"name\":\"Lithuanian Litas\",\"code\":\"LTL\",\"symbol\":\"Lt\"},{\"name\":\"Macanese Pataca\",\"code\":\"MOP\",\"symbol\":\"$\"},{\"name\":\"Macedonian Denar\",\"code\":\"MKD\",\"symbol\":\"ден\"},{\"name\":\"Malagasy Ariary\",\"code\":\"MGA\",\"symbol\":\"Ar\"},{\"name\":\"Malawian Kwacha\",\"code\":\"MWK\",\"symbol\":\"MK\"},{\"name\":\"Malaysian Ringgit\",\"code\":\"MYR\",\"symbol\":\"RM\"},{\"name\":\"Maldivian Rufiyaa\",\"code\":\"MVR\",\"symbol\":\"Rf\"},{\"name\":\"Mauritanian Ouguiya\",\"code\":\"MRO\",\"symbol\":\"MRU\"},{\"name\":\"Mauritian Rupee\",\"code\":\"MUR\",\"symbol\":\"₨\"},{\"name\":\"Mexican Peso\",\"code\":\"MXN\",\"symbol\":\"$\"},{\"name\":\"Moldovan Leu\",\"code\":\"MDL\",\"symbol\":\"L\"},{\"name\":\"Mongolian Tugrik\",\"code\":\"MNT\",\"symbol\":\"₮\"},{\"name\":\"Moroccan Dirham\",\"code\":\"MAD\",\"symbol\":\"MAD\"},{\"name\":\"Mozambican Metical\",\"code\":\"MZM\",\"symbol\":\"MT\"},{\"name\":\"Myanmar Kyat\",\"code\":\"MMK\",\"symbol\":\"K\"},{\"name\":\"Namibian Dollar\",\"code\":\"NAD\",\"symbol\":\"$\"},{\"name\":\"Nepalese Rupee\",\"code\":\"NPR\",\"symbol\":\"₨\"},{\"name\":\"Netherlands Antillean Guilder\",\"code\":\"ANG\",\"symbol\":\"ƒ\"},{\"name\":\"New Taiwan Dollar\",\"code\":\"TWD\",\"symbol\":\"$\"},{\"name\":\"New Zealand Dollar\",\"code\":\"NZD\",\"symbol\":\"$\"},{\"name\":\"Nicaraguan CÃ³rdoba\",\"code\":\"NIO\",\"symbol\":\"C$\"},{\"name\":\"Nigerian Naira\",\"code\":\"NGN\",\"symbol\":\"₦\"},{\"name\":\"North Korean Won\",\"code\":\"KPW\",\"symbol\":\"₩\"},{\"name\":\"Norwegian Krone\",\"code\":\"NOK\",\"symbol\":\"kr\"},{\"name\":\"Omani Rial\",\"code\":\"OMR\",\"symbol\":\".ع.ر\"},{\"name\":\"Pakistani Rupee\",\"code\":\"PKR\",\"symbol\":\"₨\"},{\"name\":\"Panamanian Balboa\",\"code\":\"PAB\",\"symbol\":\"B/.\"},{\"name\":\"Papua New Guinean Kina\",\"code\":\"PGK\",\"symbol\":\"K\"},{\"name\":\"Paraguayan Guarani\",\"code\":\"PYG\",\"symbol\":\"₲\"},{\"name\":\"Peruvian Nuevo Sol\",\"code\":\"PEN\",\"symbol\":\"S/.\"},{\"name\":\"Philippine Peso\",\"code\":\"PHP\",\"symbol\":\"₱\"},{\"name\":\"Polish Zloty\",\"code\":\"PLN\",\"symbol\":\"zł\"},{\"name\":\"Qatari Rial\",\"code\":\"QAR\",\"symbol\":\"ق.ر\"},{\"name\":\"Romanian Leu\",\"code\":\"RON\",\"symbol\":\"lei\"},{\"name\":\"Russian Ruble\",\"code\":\"RUB\",\"symbol\":\"₽\"},{\"name\":\"Rwandan Franc\",\"code\":\"RWF\",\"symbol\":\"FRw\"},{\"name\":\"Salvadoran ColÃ³n\",\"code\":\"SVC\",\"symbol\":\"₡\"},{\"name\":\"Samoan Tala\",\"code\":\"WST\",\"symbol\":\"SAT\"},{\"name\":\"Saudi Riyal\",\"code\":\"SAR\",\"symbol\":\"﷼\"},{\"name\":\"Serbian Dinar\",\"code\":\"RSD\",\"symbol\":\"din\"},{\"name\":\"Seychellois Rupee\",\"code\":\"SCR\",\"symbol\":\"SRe\"},{\"name\":\"Sierra Leonean Leone\",\"code\":\"SLL\",\"symbol\":\"Le\"},{\"name\":\"Singapore Dollar\",\"code\":\"SGD\",\"symbol\":\"$\"},{\"name\":\"Slovak Koruna\",\"code\":\"SKK\",\"symbol\":\"Sk\"},{\"name\":\"Solomon Islands Dollar\",\"code\":\"SBD\",\"symbol\":\"Si$\"},{\"name\":\"Somali Shilling\",\"code\":\"SOS\",\"symbol\":\"Sh.so.\"},{\"name\":\"South African Rand\",\"code\":\"ZAR\",\"symbol\":\"R\"},{\"name\":\"South Korean Won\",\"code\":\"KRW\",\"symbol\":\"₩\"},{\"name\":\"Special Drawing Rights\",\"code\":\"XDR\",\"symbol\":\"SDR\"},{\"name\":\"Sri Lankan Rupee\",\"code\":\"LKR\",\"symbol\":\"Rs\"},{\"name\":\"St. Helena Pound\",\"code\":\"SHP\",\"symbol\":\"£\"},{\"name\":\"Sudanese Pound\",\"code\":\"SDG\",\"symbol\":\".س.ج\"},{\"name\":\"Surinamese Dollar\",\"code\":\"SRD\",\"symbol\":\"$\"},{\"name\":\"Swazi Lilangeni\",\"code\":\"SZL\",\"symbol\":\"E\"},{\"name\":\"Swedish Krona\",\"code\":\"SEK\",\"symbol\":\"kr\"},{\"name\":\"Swiss Franc\",\"code\":\"CHF\",\"symbol\":\"CHf\"},{\"name\":\"Syrian Pound\",\"code\":\"SYP\",\"symbol\":\"LS\"},{\"name\":\"São Tomé and Príncipe Dobra\",\"code\":\"STD\",\"symbol\":\"Db\"},{\"name\":\"Tajikistani Somoni\",\"code\":\"TJS\",\"symbol\":\"SM\"},{\"name\":\"Tanzanian Shilling\",\"code\":\"TZS\",\"symbol\":\"TSh\"},{\"name\":\"Thai Baht\",\"code\":\"THB\",\"symbol\":\"฿\"},{\"name\":\"Tongan Pa'anga\",\"code\":\"TOP\",\"symbol\":\"$\"},{\"name\":\"Trinidad & Tobago Dollar\",\"code\":\"TTD\",\"symbol\":\"$\"},{\"name\":\"Tunisian Dinar\",\"code\":\"TND\",\"symbol\":\"ت.د\"},{\"name\":\"Turkish Lira\",\"code\":\"TRY\",\"symbol\":\"₺\"},{\"name\":\"Turkmenistani Manat\",\"code\":\"TMT\",\"symbol\":\"T\"},{\"name\":\"Ugandan Shilling\",\"code\":\"UGX\",\"symbol\":\"USh\"},{\"name\":\"Ukrainian Hryvnia\",\"code\":\"UAH\",\"symbol\":\"₴\"},{\"name\":\"United Arab Emirates Dirham\",\"code\":\"AED\",\"symbol\":\"إ.د\"},{\"name\":\"Uruguayan Peso\",\"code\":\"UYU\",\"symbol\":\"$\"},{\"name\":\"US Dollar\",\"code\":\"USD\",\"symbol\":\"$\"},{\"name\":\"Uzbekistan Som\",\"code\":\"UZS\",\"symbol\":\"лв\"},{\"name\":\"Vanuatu Vatu\",\"code\":\"VUV\",\"symbol\":\"VT\"},{\"name\":\"Venezuelan BolÃvar\",\"code\":\"VEF\",\"symbol\":\"Bs\"},{\"name\":\"Vietnamese Dong\",\"code\":\"VND\",\"symbol\":\"₫\"},{\"name\":\"Yemeni Rial\",\"code\":\"YER\",\"symbol\":\"﷼\"},{\"name\":\"Zambian Kwacha\",\"code\":\"ZMK\",\"symbol\":\"ZK\"}]}";
		 
	}
	public String cntrys() throws IOException, InterruptedException{
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("http://skyscanner.onrender.com/api/countries"))
				.header("x-rapidapi-key", "1eac24282dmsh4267d042a087ad5p14cb43jsn151923014c16")
				.header("x-rapidapi-host", "codesofcountry.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		return response.body();
		
	}
	public String placess(String curr,String code,String cntry,String locale) throws IOException, InterruptedException{
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("http://skyscanner.onrender.com/api/places?country="+cntry))
				.header("x-rapidapi-key", "1eac24282dmsh4267d042a087ad5p14cb43jsn151923014c16")
				.header("x-rapidapi-host", "skyscanner44.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		return response.body();
		
	}
}
