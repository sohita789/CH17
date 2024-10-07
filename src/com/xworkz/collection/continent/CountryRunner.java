package com.xworkz.collection.continent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CountryRunner {

	
	public static void main(String[] args) {

       CountryDTO countryDTO=new CountryDTO("afghanistan",40000000, "Hibatullah Akhundzada",Country.AFGANISTAN);
		CountryDTO countryDTO1=new CountryDTO("Albania", 2800000, "Bujar Nishani",Country.Albania);
        CountryDTO countryDTO2=new CountryDTO("Angola", 36000000, "Joao Lourenceo",Country.Angola);
        CountryDTO countryDTO3=new CountryDTO("Anguilla",15000, null,Country.Anguilla);
        CountryDTO countryDTO4=new CountryDTO("Argentina",470000,"Javier Milei",Country.Argentina);
        CountryDTO countryDTO5=new CountryDTO("Armenia",3000000, "Vahagan Kachaturuyan",Country.Armenia);
        CountryDTO countryDTO6=new CountryDTO("Ascension",800, "Null",Country.Ascension);
        CountryDTO countryDTO7=new CountryDTO("Bahamas",4000000, "charlesIII",Country.Bahamas);
        CountryDTO countryDTO8=new CountryDTO("Ascension",8655599, "Hibatullah Akhundzada",Country.Ascension);
        
        CountryDTO countryDTO9=new CountryDTO("Bahamas",86556777, "Hibatullah Akhundzada",Country.Bahamas);
		CountryDTO CountryDTO10=new CountryDTO("Australia",26000000,"David Hurley",Country.Australia);
		CountryDTO CountryDTO11=new CountryDTO("Anguilla", 150000, null,Country.Anguilla);
		CountryDTO CountryDTO12=new CountryDTO("Azerbaijan", 1000000, "IIham Aliyev",Country.Azerbaijan);
		CountryDTO CountryDTO13=new CountryDTO("Barbados", 3000000, "Sandra Mason",Country.Barbados);
		CountryDTO CountryDTO14=new CountryDTO("Barbados", 3000000, "Sandra Mason ",Country.Barbados);
		CountryDTO CountryDTO15=new CountryDTO("Barbuda", 1634,"Gaston Browne",Country.Barbuda);
		CountryDTO CountryDTO16=new CountryDTO("Barbuda", 1634,"Gaston Browne",Country.Barbuda);
		CountryDTO CountryDTO17=new CountryDTO("Bangladesh", 16980000, "Mohammed Shahabuddin",Country.Bangladesh);
		CountryDTO CountryDTO18=new CountryDTO("Belarus", 90100000, "Alexander Lulashenko",Country.Belarus);
		CountryDTO CountryDTO19=new CountryDTO("Belgium", 11005900, null,Country.Belgium);
		CountryDTO CountryDTO20=new CountryDTO("Benin", 14550000,"Patrice Talon",Country.Benin);
		CountryDTO CountryDTO21=new CountryDTO("Bermuda", 64617,null,Country.Bermuda);
		CountryDTO CountryDTO22=new CountryDTO("Bhutan", 792742, null,Country.Bhutan);
		CountryDTO CountryDTO23=new CountryDTO("Bolivia", 12570000, "Luis Arce",Country.Bolivia);
		CountryDTO CountryDTO24=new CountryDTO("Bonaire", 241000, null,Country.Bonaire);
		CountryDTO CountryDTO25=new CountryDTO("Bosnia", 31600000, null,Country.Bosnia);
		CountryDTO CountryDTO26=new CountryDTO("Botswana", 2720000, "Mokgweetsi Masisi",Country.Botswana);
		CountryDTO CountryDTO27=new CountryDTO("Brazil", 21220000,"Luiz Inacio Lula da Silva",Country.Brazil);
		CountryDTO CountryDTO28=new CountryDTO("BritishVirginIslands", 39547, null, Country.BritishVirginIslands);
		CountryDTO CountryDTO29=new CountryDTO("Bulgaria", 6700000,"Rumen Radev",Country.Bulgaria);
		CountryDTO CountryDTO30=new CountryDTO("BurkinaFaso", 23840000,"Ibrahim Traore",Country.BurkinaFaso);
		CountryDTO CountryDTO31=new CountryDTO("BurkinaFaso", 23840000, "Ibrahim Traore",Country.BurkinaFaso);
		CountryDTO CountryDTO32=new CountryDTO("Burundi", 14140000,"Evarishte Ndayishimiye", Country.Burundi);
		
		CountryDTO CountryDTO33=new CountryDTO("Cambodia", 1770000, "Hun Manet",Country.Cambodia);
		CountryDTO CountryDTO34=new CountryDTO("Cameroon", 2930000,"Paul Biya",Country.Cameroon);
	    CountryDTO CountryDTO35=new CountryDTO("Canada", 4101000, null,Country.Canada);
		CountryDTO CountryDTO36=new CountryDTO("China", 1414329178, "XI jinping",Country.China);
		CountryDTO CountryDTO37=new CountryDTO("Columbia",522886523, "Gustavo Petro",Country.Columbia);
		CountryDTO CountryDTO38=new CountryDTO("CoteDe Ivore",31934230, "Alassane ouattara",Country.CoteDeIvore);
		CountryDTO CountryDTO39=new CountryDTO("cameroon",291123740 , "paul biya",Country.cameron);
		CountryDTO CountryDTO40=new CountryDTO("Chad", 20299123, "Mahamat Idriss Deby",Country.Chad);
		CountryDTO CountryDTO41=new CountryDTO("chile", 19764751, "Gabriel Boric",Country.Chile);
		CountryDTO CountryDTO42=new CountryDTO("Cambodia", 17638801, null,Country.Cambodia);
		CountryDTO CountryDTO43=new CountryDTO("Cuba", 10979863,"Diaz-canel",Country.Cuba);
		CountryDTO CountryDTO44=new CountryDTO("Czechia", 10735539,"peter pavel",Country.Czechia);
		CountryDTO CountryDTO45=new CountryDTO("Central African Republic", 5333960, "faustin-archange",Country.Canada);
		CountryDTO CountryDTO46=new CountryDTO("CostaRicha", 5129450, "Rodrigo Chaves Robles",Country.CostaRicha);
        CountryDTO CountryDTO59=new CountryDTO("CaymanIslands", 0, "Juliana O'Connor-Connolly", Country.CaymanIslands);
		CountryDTO CountryDTO60=new CountryDTO("Congo", 6332961	, "Felix Tshiseked",Country.Congo);
		CountryDTO CountryDTO61=new CountryDTO("Cyprus", 1358282	, "Nikos Christodoulides",Country.Cyprus);
		CountryDTO CountryDTO62=new CountryDTO("CzechRepublic", 10735859	, "Petr Pavel", Country.CzechRepublic);
		CountryDTO CountryDTO63=new CountryDTO("CookIslands", 0, "Mark Brown",Country.CookIslands);
		
		CountryDTO CountryDTO64=new CountryDTO("Denmark", 5977412	, "Queen – Margrethe",Country.Denmark);
		CountryDTO CountryDTO65=new CountryDTO("Djibouti", 1168722	, "Ismaïl Omar Guelleh",Country.Djibouti);
		CountryDTO CountryDTO66=new CountryDTO("Dominica",66205	, "Charles Savarin",Country.Dominica);
		CountryDTO CountryDTO67=new CountryDTO("DominicanRepubli", 11427557	, "Luis Abinader",Country.DominicanRepubli);
		
		CountryDTO CountryDTO68=new CountryDTO("EasterIsland", 0,"Laura Tarita Rapu Alarcón",Country.EasterIsland);
		CountryDTO CountryDTO69=new CountryDTO("Ecuador",18135478	, "Daniel Noboa",Country.Ecuador);
		CountryDTO CountryDTO70=new CountryDTO("Egypt", 	116538258	, "Abdel Fattah el-Sisi",Country.Egypt);

	    CountryDTO CountryDTO71=new CountryDTO("EquatoriaGuinea",1892516	, "",Country.EquatoriaGuinea);
		CountryDTO CountryDTO72=new CountryDTO("Eritrea",3535603	, "",Country.Eritrea);
		CountryDTO CountryDTO73=new CountryDTO("Estonia", 1360546	, "Alar Karis",Country.Estonia);
		CountryDTO CountryDTO74=new CountryDTO("Eswatini", 1242822, "",Country.Eswatini);
		CountryDTO CountryDTO75=new CountryDTO("Ethiopia", 132059767,"Sahle-Work Zewde",Country.Ethiopia);
		
		CountryDTO CountryDTO76=new CountryDTO("Germany", 8454242, "Frank-walter Steinmaeir",Country.Germany);
		CountryDTO CountryDTO77=new CountryDTO("Ghana", 34247414, "akufo-addo",Country.Ghana);
		CountryDTO CountryDTO78=new CountryDTO("Greece", 10047768, "katerina sakellaropoulu",Country.Greece);
		CountryDTO CountryDTO79=new CountryDTO("Georgea", 3801670,"salome zourabichvii",Country.Georgea);
		CountryDTO CountryDTO80=new CountryDTO("Gambia",2759988 ,"adama barrow",Country.Gambia);
		CountryDTO CountryDTO81=new CountryDTO("Gabon", 2538952,"brice oligui nguema",Country.Gabon);
		CountryDTO CountryDTO82=new CountryDTO("GuineaBissau", 2302512,"umaro sissoco embalo",Country.GuineaBissau);
		CountryDTO CountryDTO83=new CountryDTO("Guam", 167777,null ,Country.Guam);
		CountryDTO CountryDTO84=new CountryDTO("Grenada",117207 , null,Country.Grenada);
		CountryDTO CountryDTO85=new CountryDTO("Greenland", 55840,null,Country.Greenland);
		CountryDTO CountryDTO86=new CountryDTO("Gribalatar", 39349, null,Country.Gribalatar);
		
		CountryDTO CountryDTO87=new CountryDTO("Haiti", 11580000, null,Country.Haiti);
		CountryDTO CountryDTO88=new CountryDTO("Honduras", 1087000,"Xiomara Castro",Country.Honduras);
		CountryDTO CountryDTO89=new CountryDTO("Hungary", 9600000, "tamas sulyok",Country.Hungary);
		CountryDTO CountryDTO90=new CountryDTO("Hong Kong",7530000, null,Country.HongKong);
		CountryDTO CountryDTO91=new CountryDTO("Holy See", 526, "pope francis",Country.HolySee);
		
		CountryDTO CountryDTO92=new CountryDTO("India", 1450935791, "Draupadi murmu",Country.India);
		CountryDTO CountryDTO93=new CountryDTO("indonesia", 283487931, "joko widado",Country.indonesia);
		CountryDTO CountryDTO94=new CountryDTO("iran", 91567738, "Masoud pezeshkian",Country.iran);
		CountryDTO CountryDTO95=new CountryDTO("italy", 91567738, "sergio mattarella",Country.italy);
		CountryDTO CountryDTO96=new CountryDTO("iraq", 46042015, "Abdul latif",Country.iraq);
		CountryDTO CountryDTO97=new CountryDTO("isaeral", 9387021, "isaac herzog",Country.isaeral);
		CountryDTO CountryDTO98=new CountryDTO("Ireland",5255017, "micheal d.higgings",Country.Ireland);
		CountryDTO CountryDTO99=new CountryDTO("Iceland", 393396, "halla tomasdottir",Country.Iceland);
		
		
         CountryDTO countryDTO100=new CountryDTO("Jamaica",2753000, "Andrew Holness",Country.Jamaica);
		 CountryDTO countryDTO101=new CountryDTO("Japan",123953000, "Fumio Kishida",Country.Japan);
		 CountryDTO countryDTO102=new CountryDTO("Jersey",11680000, "Lyndon Farnham",Country.Jersey);
		 CountryDTO countryDTO103=new CountryDTO("Jordan",	11680000, "Sarah Mensah",Country.Jordan);
		
		
		CountryDTO countryDTO104=new CountryDTO("Kazakhstan",20485000,"Kassym-Jomart Tokayev",Country.Kazakhstan);
		CountryDTO countryDTO105=new CountryDTO("Kenya", 51563000,"Willium Ruto",Country.Kenya);
		CountryDTO countryDTO106=new CountryDTO("Kiribati", 126700, "Taneti Maamau",Country.Kiribati);
		CountryDTO countryDTO107=new CountryDTO("Kosovo",18000000, "Vjosa Osmani",Country.Kosovo);
		CountryDTO countryDTO108=new CountryDTO("Kuwait",5184000, "Mishal Al-Ahmad",Country.Kuwait);
		CountryDTO countryDTO109=new CountryDTO("Kyrgyzstan",7254000, "Sadyr Japarov",Country.Kyrgyzstan);
		
		
		CountryDTO countryDTO110=new CountryDTO("Laos", 7658000,"Thongloun Sisoulith",Country.Laos);
		CountryDTO countryDTO111=new CountryDTO("Latvia",1875000, "Edgars Rinkēvičs",Country.Latvia);
		CountryDTO countryDTO112=new CountryDTO("Lebanon",7447000,"Aoun",Country.Lebanon);
		CountryDTO countryDTO113=new CountryDTO("Lesotho",2120000, "Ntsokoane Samuel Matekane",Country.Lesotho);
		CountryDTO countryDTO114=new CountryDTO("Liberia",5498000,"Joseph Boakai",Country.Liberia);
		
		
		CountryDTO countryDTO115=new CountryDTO("Peru",34096000,"Dina Boluarte",Country.Peru);
		CountryDTO countryDTO116=new CountryDTO("Philippines",116628000,"Bongbong Marcos",Country.Philippines);
		CountryDTO countryDTO117=new CountryDTO("Poland", 37587000, "Andrzej duda",Country.Poland);
		CountryDTO countryDTO118=new CountryDTO("Portugal", 10578000, null,Country.Portugal);
		CountryDTO countryDTO119=new CountryDTO("Qatar", 2986000, "marcelo rebilo",Country.Qatar);
		CountryDTO countryDTO120=new CountryDTO("Réunion",8857000, "Huguette bello",Country.Réunion);
		CountryDTO countryDTO121=new CountryDTO("Romania", 18673000, null,Country.Romania);
		CountryDTO countryDTO122=new CountryDTO("Russia",144820423,"Vladimir Putin",Country.Russia);
		CountryDTO countryDTO123=new CountryDTO("Rwanda",14256567	, " Paul Kagame", Country.Rwanda);
		CountryDTO countryDTO124=new CountryDTO("SaintBarthelemy", 9131,"", Country.SaintBarthelemy);
		CountryDTO countryDTO125=new CountryDTO("SaintHelena", 5226, "", Country.SaintHelena);
		CountryDTO countryDTO126=new CountryDTO("SaintKittsandNevis", 46843	, "King – Charles ", Country.SaintKittsandNevis);
		CountryDTO countryDTO127=new CountryDTO("SaintLucia",179744	, "King – Charles", Country.SaintLucia);
		CountryDTO countryDTO128=new CountryDTO("SaintMartin", 42848, " Francesca Civerchia", Country.SaintMartin);
		CountryDTO countryDTO129=new CountryDTO("SaintPierreandMiquelon",100616,"FrancescaCiverchia",Country.SaintPierreandMiquelon);
		CountryDTO countryDTO130=new CountryDTO("SaintVincentandtheGrenadines",100616, "Charles",Country.SaintVincentandtheGrenadines);
		CountryDTO countryDTO131=new CountryDTO("Samoa",218019, "Afioga", Country.Samoa);
		CountryDTO countryDTO132=new CountryDTO("SanMarino",33581, "Francesca Civerchia", Country.SanMarino);
		
        CountryDTO countryDTO133=new CountryDTO("SaoTomeandPrincipe",235536	,null, Country.SaoTomeandPrincipe);
		CountryDTO countryDTO134=new CountryDTO("SaudiArabia",33962757	, "King – Salman", Country.SaudiArabia);
		CountryDTO countryDTO135=new CountryDTO("Senegal",18501984	, "Bassirou Diomaye Faye", Country.Senegal);
		CountryDTO countryDTO136=new CountryDTO("Seychelles", 130418	, " Wavel Ramkalawan", Country.Seychelles);
		CountryDTO countryDTO137=new CountryDTO("Seychelles", 130418	, " Wavel Ramkalawan", Country.Seychelles);
		CountryDTO countryDTO138=new CountryDTO("SierraLeone", 8642022	, "Julius Maada Bio", Country.SierraLeone);
		CountryDTO countryDTO139=new CountryDTO("Singapore",5832387, "Tharman Shanmugaratnam", Country.Singapore);
		CountryDTO countryDTO140=new CountryDTO("SintMaarten",43492, null, Country.SintMaarten);
		CountryDTO countryDTO141=new CountryDTO("SaintPierreandMiquelon",5394 , "", Country.SaintPierreandMiquelon);
		CountryDTO countryDTO142=new CountryDTO("Slovakia",5506760	, " Peter Pellegrini", Country.Slovakia);
		CountryDTO countryDTO143=new CountryDTO("Slovenia",2118697	, " Peter Pellegrini", Country.Slovenia);
		CountryDTO countryDTO144=new CountryDTO("Somalia", 19009151	, "Hassan Sheikh Mohamud", Country.Somalia);
		CountryDTO countryDTO145=new CountryDTO("SouthAfrica",64007187	, " Cyril Ramaphosa", Country.SouthAfrica);
		CountryDTO countryDTO146=new CountryDTO("SouthKorea", 51717590	, "Yoon Suk-yeo", Country.SouthKorea);
		CountryDTO countryDTO147=new CountryDTO("SouthSudan",11943408	, "Salva Kiir Mayardit", Country.SouthSudan);
		CountryDTO countryDTO148=new CountryDTO("Spain", 47910526	, "King – Felipe ", Country.Spain);
		CountryDTO countryDTO149=new CountryDTO("SriLanka",23103565	, " Anura Kumara", Country.SriLanka);
		CountryDTO countryDTO150=new CountryDTO("Sudan", 50448963	, "Abdel Fattah al-Burhan", Country.Sudan);
		CountryDTO countryDTO151=new CountryDTO("SvalbardandJanMayen",2504, "", Country.SvalbardandJanMayen);
		CountryDTO countryDTO152=new CountryDTO("SvalbardandJanMayen",2504, "", Country.SvalbardandJanMayen);
		CountryDTO countryDTO153=new CountryDTO("Swaziland", 1242822, "", Country.Swaziland);
		CountryDTO countryDTO154=new CountryDTO("Sweden",10606999	, "King – Carl XVI Gustaf", Country.Sweden);
		CountryDTO countryDTO155=new CountryDTO("Switzerland",8921981	, "Viola Amherd ", Country.Switzerland);
		CountryDTO countryDTO156=new CountryDTO("Syria",24672760	, "Bashar al-Assad", Country.Syria);
		CountryDTO countryDTO157=new CountryDTO("Taiwan", 23213962, "Lai Ching-te", Country.Taiwan);
		CountryDTO countryDTO158=new CountryDTO("Tajikistan", 10641958, "Emomali Rahmon", Country.Tajikistan);
		CountryDTO countryDTO159=new CountryDTO("Tanzania", 68560157 , "Samia Suluhu Hassan", Country.Tanzania);
		CountryDTO countryDTO160=new CountryDTO("Thailand",71668011	, "Maha Vajiralongkorn", Country.Thailand);
		CountryDTO countryDTO161=new CountryDTO("Tonga",104175, " Faure Gnassingbé", Country.Tonga);
		CountryDTO countryDTO162=new CountryDTO("TrinidadandTobago", 150778, "Christine Kangaloo", Country.TrinidadandTobago);
		CountryDTO countryDTO163=new CountryDTO("Tunisia",12277109	, "Kaïs Saïed", Country.Tunisia);
		CountryDTO countryDTO164=new CountryDTO("Turkey",87473805	, "Recep Tayyip Erdoğan", Country.Turkey);
		CountryDTO countryDTO165=new CountryDTO("Turkmenistan",7494498	, "Gurbanguly Berdimuhamedow", Country.Turkmenistan);
		CountryDTO countryDTO166=new CountryDTO("TurksandCaicosIslands", 0, "", Country.TurksandCaicosIslands);
		CountryDTO countryDTO167=new CountryDTO("Tuvalu", 9646	, "	King – Charles ", Country.Tuvalu);
		CountryDTO countryDTO168=new CountryDTO("Uganda",50015092	, " Yoweri Museveni", Country.Uganda);
		CountryDTO countryDTO169=new CountryDTO("Uganda",50015092	, " Yoweri Museveni", Country.Uganda);
		CountryDTO countryDTO170=new CountryDTO("Ukraine",	37860221, "Volodymyr Zelenskyy", Country.Ukraine);
		CountryDTO countryDTO171=new CountryDTO("UnitedKingdom", 69138192	, "King – Charles ", Country.UnitedKingdom);
		CountryDTO countryDTO172=new CountryDTO("UnitedStates",345426571	, "Joe Biden", Country.UnitedStates);
		CountryDTO countryDTO173=new CountryDTO("Uruguay",3386588, "Luis Lacalle Pou", Country.Uruguay);
		CountryDTO countryDTO174=new CountryDTO("Uzbekistan", 36361859, "Shavkat Mirziyoyev[", Country.Uzbekistan);
		CountryDTO countryDTO175=new CountryDTO("Vanuatu", 327777, "Nikenike Vurobaravu", Country.Vanuatu);
		CountryDTO countryDTO176=new CountryDTO("Vatican", 764, " Pope Francis", Country.Vatican);
		CountryDTO countryDTO177=new CountryDTO("Venezuela",28405543	, " Nicolás Maduro", Country.Venezuela);
		CountryDTO countryDTO178=new CountryDTO("Vietnam",100987686	, " Tô Lâm", Country.Vietnam);
		CountryDTO countryDTO179=new CountryDTO("WallisandFutuna", 11255, "", Country.WallisandFutuna);
		CountryDTO countryDTO180=new CountryDTO("Yemen",40583164	, "Rashad al-Alimi", Country.Yemen);
		CountryDTO countryDTO181=new CountryDTO("Zambia", 21314956	, "Hakainde Hichilema", Country.Zambia);
		CountryDTO countryDTO182=new CountryDTO("Zimbabwe",16634373	, " Emmerson Mnangagwa", Country.Zimbabwe);
		
		
        Collection<CountryDTO> collection=new LinkedList<CountryDTO>();
		collection.add(countryDTO);
		collection.add(countryDTO1);
		collection.add(countryDTO2);
		collection.add(countryDTO3);
		collection.add(countryDTO4);
		collection.add(countryDTO5);
		collection.add(countryDTO6);
		collection.add(countryDTO7);
		collection.add(countryDTO8);
		collection.add(countryDTO9);
		collection.add(CountryDTO10);
		collection.add(CountryDTO11);
		collection.add(CountryDTO12);
		collection.add(CountryDTO13);
		collection.add(CountryDTO14);
		collection.add(CountryDTO15);
		collection.add(CountryDTO16);
		collection.add(CountryDTO17);
		collection.add(CountryDTO18);
		collection.add(CountryDTO19);
		collection.add(CountryDTO20);
		collection.add(CountryDTO21);
		collection.add(CountryDTO22);
		collection.add(CountryDTO23);
		collection.add(CountryDTO24);
		collection.add(CountryDTO25);
		collection.add(CountryDTO26);
		collection.add(CountryDTO27);
		collection.add(CountryDTO28);
		collection.add(CountryDTO29);
		collection.add(CountryDTO30);
		collection.add(CountryDTO31);
		collection.add(CountryDTO32);
		collection.add(CountryDTO33);
		collection.add(CountryDTO34);
		collection.add(CountryDTO35);
		collection.add(CountryDTO36);
		collection.add(CountryDTO37);
		collection.add(CountryDTO38);
		collection.add(CountryDTO39);
		collection.add(CountryDTO40);
		collection.add(CountryDTO41);
		collection.add(CountryDTO42);
		collection.add(CountryDTO43);
		collection.add(CountryDTO44);
		collection.add(CountryDTO45);
		collection.add(CountryDTO46);
		
		collection.add(CountryDTO59);
		collection.add(CountryDTO60);
		collection.add(CountryDTO61);
		collection.add(CountryDTO62);
		collection.add(CountryDTO63);
		collection.add(CountryDTO64);
		collection.add(CountryDTO65);
		collection.add(CountryDTO66);
		collection.add(CountryDTO67);
		collection.add(CountryDTO68);
		collection.add(CountryDTO69);
		collection.add(CountryDTO70);
		collection.add(CountryDTO71);
		collection.add(CountryDTO72);
		collection.add(CountryDTO73);
		collection.add(CountryDTO74);
		collection.add(CountryDTO74);
		collection.add(CountryDTO75);
		collection.add(CountryDTO76);
		collection.add(CountryDTO77);
		collection.add(CountryDTO78);
		collection.add(CountryDTO79);
		collection.add(CountryDTO80);
		collection.add(CountryDTO81);
		collection.add(CountryDTO82);
		collection.add(CountryDTO83);
		collection.add(CountryDTO84);
		collection.add(CountryDTO85);
		collection.add(CountryDTO86);
		collection.add(CountryDTO87);
		collection.add(CountryDTO88);
		collection.add(CountryDTO89);
		collection.add(CountryDTO90);
		collection.add(CountryDTO91);
		collection.add(CountryDTO92);
		collection.add(CountryDTO93);
		collection.add(CountryDTO94);
		collection.add(CountryDTO95);
		collection.add(CountryDTO96);
		collection.add(CountryDTO97);
		collection.add(CountryDTO98);
		collection.add(CountryDTO99);
		collection.add(countryDTO100);
		collection.add(countryDTO101);
		collection.add(countryDTO102);
		collection.add(countryDTO103);
		collection.add(countryDTO104);
		
		
		
		
		
		System.out.println("Total Elements:"+collection.size());
		System.out.println("isEmpty:"+collection.isEmpty());
        System.out.println("After clear......");
		
		System.out.println("Total Elements:"+collection.size());
		System.out.println("isEmpty:"+collection.isEmpty());
		
		Iterator<CountryDTO> iterator=collection.iterator();//
		//methods are accessed to  search or filter the elements
		while(iterator.hasNext()) {
		
		CountryDTO ref=iterator.next();//get the element and move the cursor
		System.out.println(countryDTO);//toString
		
		
}
	System.out.println("Total Elements:"+collection.size());
	System.out.println("isEmpty:"+collection.isEmpty());
    System.out.println("After clear......");
	
	System.out.println("Total Elements:"+collection.size());
	System.out.println("isEmpty:"+collection.isEmpty());
	 System.out.println("===============================================================");
		
	 
	 Iterator<CountryDTO> iterator1 = collection.iterator();
	 
	   while (iterator1.hasNext())
	   {
	    CountryDTO ref = iterator1.next();
	    System.out.println(ref); 
	   }
	 System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	   
	 System.out.println("country name where population is greater than 25 CR");
	 
		
	 for (CountryDTO country : collection) 
	   {
		  
            if (country.getpopulation()>250000000) 
            {  // Case-insensitive check
                System.out.println(country.getpopulation());
            }   
        } 
	 System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	 System.out.println("countries contains 'I' in the name");
		   for (CountryDTO country : collection) 
		   {
			  
	            if (country.getName().contains("I")) 
	            {  // Case-insensitive check
	                System.out.println(country.getName());
	            }   
	        } 
		   System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	            
		   System.out.println("the countries where code is less than 50");
	            for (CountryDTO country : collection) 
				   {
					 
		    if (country.getcode() < 50) {
		    	
                System.out.println(country.getName());

	        }
		}
	            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	            System.out.println(" the countries where code is less than 50 and country name starts with 'A'");
	            
	            
	            for (CountryDTO country : collection) 
				   {
					 
		    if (country.getcode() < 50 && country.getName().startsWith("A")) {
                System.out.println( country.getName());
		    }
		    }
	            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	            System.out.println("all the presidentName by each country");
                for (CountryDTO country : collection) 
				   {
                System.out.println(country.getpresidentName());

	        }
		}
}