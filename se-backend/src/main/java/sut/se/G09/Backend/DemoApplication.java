package sut.se.G09.Backend;

import sut.se.G09.Backend.Entity.*;
import sut.se.G09.Backend.Repository.*;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	ApplicationRunner init( DurationAppointmentRepository durationAppointmentRepository
			, DateAppointmentRepository dateAppointmentRepository
			, CategoryRepository categoryRepository
			, ProvinceRepository provinceRepository, GenderRepository genderRepository) {
		return args -> {

				DurationAppointment dur1 = new DurationAppointment(1L,"08.00-10.00 น.");
				DurationAppointment dur2 = new DurationAppointment(2L,"10.00-12.00 น.");
				DurationAppointment dur3 = new DurationAppointment(3L,"13.00-15.00 น.");
				DurationAppointment dur4 = new DurationAppointment(4L,"15.00-17.00 น.");
				durationAppointmentRepository.save(dur1);
				durationAppointmentRepository.save(dur2);
				durationAppointmentRepository.save(dur3);
				durationAppointmentRepository.save(dur4);

			Stream.of(1L, 2L,3L,4L,5L,6L,7L,8L,9L,10L,11L,12L,13L,14L,15L,16L,17L,18L,19L,20L,21L,22L,23L,24L,25L
					,26L,27L,28L,29L,30L,31L,32L,33L,34L,35L,36L,37L,38L,39L,40L,41L,42L,43L,44L,45L,46L,47L,48L,49L,50L
					,51L,52L,53L,54L,55L,56L,57L,58L,59L).forEach(dateId -> {
				DateAppointment date = new DateAppointment();
				date.setDateId(dateId);
				if(dateId==1L){date.setDate("1 มกราคม 2562");}
				else if(dateId==2L){date.setDate("2 มกราคม 2562");}
				else if(dateId==3L){date.setDate("3 มกราคม 2562");}
				else if(dateId==4L){date.setDate("4 มกราคม 2562");}
				else if(dateId==5L){date.setDate("5 มกราคม 2562");}
				else if(dateId==6L){date.setDate("6 มกราคม 2562");}
				else if(dateId==7L){date.setDate("7 มกราคม 2562");}
				else if(dateId==8L){date.setDate("8 มกราคม 2562");}
				else if(dateId==9L){date.setDate("9 มกราคม 2562");}
				else if(dateId==10L){date.setDate("10 มกราคม 2562");}
				else if(dateId==11L){date.setDate("11 มกราคม 2562");}
				else if(dateId==12L){date.setDate("12 มกราคม 2562");}
				else if(dateId==13L){date.setDate("13 มกราคม 2562");}
				else if(dateId==14L){date.setDate("14 มกราคม 2562");}
				else if(dateId==15L){date.setDate("15 มกราคม 2562");}
				else if(dateId==16L){date.setDate("16 มกราคม 2562");}
				else if(dateId==17L){date.setDate("17 มกราคม 2562");}
				else if(dateId==18L){date.setDate("18 มกราคม 2562");}
				else if(dateId==19L){date.setDate("19 มกราคม 2562");}
				else if(dateId==20L){date.setDate("20 มกราคม 2562");}
				else if(dateId==21L){date.setDate("21 มกราคม 2562");}
				else if(dateId==22L){date.setDate("22 มกราคม 2562");}
				else if(dateId==23L){date.setDate("23 มกราคม 2562");}
				else if(dateId==24L){date.setDate("24 มกราคม 2562");}
				else if(dateId==25L){date.setDate("25 มกราคม 2562");}
				else if(dateId==26L){date.setDate("26 มกราคม 2562");}
				else if(dateId==27L){date.setDate("27 มกราคม 2562");}
				else if(dateId==28L){date.setDate("28 มกราคม 2562");}
				else if(dateId==29L){date.setDate("29 มกราคม 2562");}
				else if(dateId==30L){date.setDate("30 มกราคม 2562");}
				else if(dateId==31L){date.setDate("31 มกราคม 2562");}
				else if(dateId==32L){date.setDate("1 มกราคม 2562");}
				else if(dateId==33L){date.setDate("2 กุมภาพันธ์ 2562");}
				else if(dateId==34L){date.setDate("3 กุมภาพันธ์ 2562");}
				else if(dateId==35L){date.setDate("4 กุมภาพันธ์ 2562");}
				else if(dateId==36L){date.setDate("5 กุมภาพันธ์ 2562");}
				else if(dateId==37L){date.setDate("6 กุมภาพันธ์ 2562");}
				else if(dateId==38L){date.setDate("7 กุมภาพันธ์ 2562");}
				else if(dateId==39L){date.setDate("8 กุมภาพันธ์ 2562");}
				else if(dateId==40L){date.setDate("9 กุมภาพันธ์ 2562");}
				else if(dateId==41L){date.setDate("10 กุมภาพันธ์ 2562");}
				else if(dateId==42L){date.setDate("11 กุมภาพันธ์ 2562");}
				else if(dateId==43L){date.setDate("12 กุมภาพันธ์ 2562");}
				else if(dateId==44L){date.setDate("13 กุมภาพันธ์ 2562");}
				else if(dateId==45L){date.setDate("14 กุมภาพันธ์ 2562");}
				else if(dateId==46L){date.setDate("15 กุมภาพันธ์ 2562");}
				else if(dateId==47L){date.setDate("16 กุมภาพันธ์ 2562");}
				else if(dateId==48L){date.setDate("17 กุมภาพันธ์ 2562");}
				else if(dateId==49L){date.setDate("18 กุมภาพันธ์ 2562");}
				else if(dateId==50L){date.setDate("19 กุมภาพันธ์ 2562");}
				else if(dateId==51L){date.setDate("20 กุมภาพันธ์ 2562");}
				else if(dateId==52L){date.setDate("21 กุมภาพันธ์ 2562");}
				else if(dateId==53L){date.setDate("22 กุมภาพันธ์ 2562");}
				else if(dateId==54L){date.setDate("23 กุมภาพันธ์ 2562");}
				else if(dateId==55L){date.setDate("24 กุมภาพันธ์ 2562");}
				else if(dateId==56L){date.setDate("25 กุมภาพันธ์ 2562");}
				else if(dateId==57L){date.setDate("26 กุมภาพันธ์ 2562");}
				else if(dateId==58L){date.setDate("27 กุมภาพันธ์ 2562");}
				else if(dateId==59L){date.setDate("28 กุมภาพันธ์ 2562");}
				dateAppointmentRepository.save(date);
			});

			Stream.of(1L, 2L).forEach(genderId -> {                  //***define type of rights detail***
				Gender newGender = new Gender();
				newGender.setGenderId(genderId);
				if(genderId==1L){ newGender.setGenderName("ชาย"); }
				else if(genderId==2L){ newGender.setGenderName("หญิง"); }
				genderRepository.save(newGender);
			});

			Category category1 = new Category();  //เบี้ยประกัน
			category1.setTypeName("ตายไวได้ตัง");
			categoryRepository.save(category1);
			Category category2 = new Category();
			category2.setTypeName("จ่ายร้อยได้ล้าน");
			categoryRepository.save(category2);
			Category category3 = new Category();
			category3.setTypeName("สุขภาพดีมีสุข");
			categoryRepository.save(category3);
			Category category4 = new Category();
			category4.setTypeName("ตายแล้วได้ล้าน");
			categoryRepository.save(category4);
			Category category5 = new Category();
			category5.setTypeName("ชีวิตดีมีหนี้สิน");
			categoryRepository.save(category5);


			Stream.of(1L, 2L,3L,4L,5L,6L,7L,8L,9L,10L,11L,12L,13L,14L,15L,16L,17L,18L,19L,20L,21L,22L,23L,24L,25L
					,26L,27L,28L,29L,30L,31L,32L,33L,34L,35L,36L,37L,38L,39L,40L,41L,42L,43L,44L,45L,46L,47L,48L,49L,50L
					,51L,52L,53L,54L,55L,56L,57L,58L,59L,60L,61L,62L,63L,64L,65L,66L,67L,68L,69L,70L,71L,72L,73L,74L,75L
					,76L,77L).forEach(provinceId -> {

				Province newProvince = new Province();
				newProvince.setId(provinceId);
				if(provinceId == 1L){ newProvince.setProvinceName("Bangkok"); }
				else if(provinceId == 2L){ newProvince.setProvinceName("AmnatCharoen"); }
				else if(provinceId == 3L){ newProvince.setProvinceName("AngThong"); }
				else if(provinceId == 4L){ newProvince.setProvinceName("BuengKan"); }
				else if(provinceId == 5L){ newProvince.setProvinceName("Buriram"); }
				else if(provinceId == 6L){ newProvince.setProvinceName("Chachoengsao"); }
				else if(provinceId == 7L){ newProvince.setProvinceName("Chainat"); }
				else if(provinceId == 8L){ newProvince.setProvinceName("Chaiyaphum"); }
				else if(provinceId == 9L){ newProvince.setProvinceName("Chanthaburi"); }
				else if(provinceId == 10L){ newProvince.setProvinceName("ChiangMai"); }
				else if(provinceId == 11L){ newProvince.setProvinceName("ChiangRai"); }
				else if(provinceId == 12L){ newProvince.setProvinceName("Chonburi"); }
				else if(provinceId == 13L){ newProvince.setProvinceName("Chumphon"); }
				else if(provinceId == 14L){ newProvince.setProvinceName("Kalasin"); }
				else if(provinceId == 15L){ newProvince.setProvinceName("KamphaengPhet"); }
				else if(provinceId == 16L){ newProvince.setProvinceName("Kanchanaburi"); }
				else if(provinceId == 17L){ newProvince.setProvinceName("KhonKaen"); }
				else if(provinceId == 18L){ newProvince.setProvinceName("Krabi"); }
				else if(provinceId == 19L){ newProvince.setProvinceName("Lampang"); }
				else if(provinceId == 20L){ newProvince.setProvinceName("Lamphun"); }
				else if(provinceId == 21L){ newProvince.setProvinceName("Loei"); }
				else if(provinceId == 22L){ newProvince.setProvinceName("Lopburi"); }
				else if(provinceId == 23L){ newProvince.setProvinceName("MaeHongSon"); }
				else if(provinceId == 24L){ newProvince.setProvinceName("MahaSarakham"); }
				else if(provinceId == 25L){ newProvince.setProvinceName("Mukdahan"); }
				else if(provinceId == 26L){ newProvince.setProvinceName("NakhonNayok"); }
				else if(provinceId == 27L){ newProvince.setProvinceName("NakhonPathom"); }
				else if(provinceId == 28L){ newProvince.setProvinceName("NakhonPhanom"); }
				else if(provinceId == 29L){ newProvince.setProvinceName("NakhonRatchasima"); }
				else if(provinceId == 30L){ newProvince.setProvinceName("NakhonSawan"); }
				else if(provinceId == 31L){ newProvince.setProvinceName("NakhonSiThammarat"); }
				else if(provinceId == 32L){ newProvince.setProvinceName("Nan"); }
				else if(provinceId == 33L){ newProvince.setProvinceName("Narathiwat"); }
				else if(provinceId == 34L){ newProvince.setProvinceName("NongBuaLamphu"); }
				else if(provinceId == 35L){ newProvince.setProvinceName("NongKhaiCity"); }
				else if(provinceId == 36L){ newProvince.setProvinceName("Nonthaburi"); }
				else if(provinceId == 37L){ newProvince.setProvinceName("PathumThani"); }
				else if(provinceId == 38L){ newProvince.setProvinceName("Pattani"); }
				else if(provinceId == 39L){ newProvince.setProvinceName("PhangNga"); }
				else if(provinceId == 40L){ newProvince.setProvinceName("Phatthalung"); }
				else if(provinceId == 41L){ newProvince.setProvinceName("Phayao"); }
				else if(provinceId == 42L){ newProvince.setProvinceName("Phetchabun"); }
				else if(provinceId == 43L){ newProvince.setProvinceName("Phetchaburi"); }
				else if(provinceId == 44L){ newProvince.setProvinceName("Phichit"); }
				else if(provinceId == 45L){ newProvince.setProvinceName("Phitsanulok"); }
				else if(provinceId == 46L){ newProvince.setProvinceName("PhraNakhonSiAyutthaya"); }
				else if(provinceId == 47L){ newProvince.setProvinceName("Phrae"); }
				else if(provinceId == 48L){ newProvince.setProvinceName("Phuket"); }
				else if(provinceId == 49L){ newProvince.setProvinceName("Prachinburi"); }
				else if(provinceId == 50L){ newProvince.setProvinceName("PrachuapKhiriKhan"); }
				else if(provinceId == 51L){ newProvince.setProvinceName("Ranong"); }
				else if(provinceId == 52L){ newProvince.setProvinceName("Ratchaburi"); }
				else if(provinceId == 53L){ newProvince.setProvinceName("Rayong"); }
				else if(provinceId == 54L){ newProvince.setProvinceName("RoiEt"); }
				else if(provinceId == 55L){ newProvince.setProvinceName("SaKaeo"); }
				else if(provinceId == 56L){ newProvince.setProvinceName("SakonNakhon"); }
				else if(provinceId == 57L){ newProvince.setProvinceName("SamutPrakan"); }
				else if(provinceId == 58L){ newProvince.setProvinceName("SamutSakhon"); }
				else if(provinceId == 59L){ newProvince.setProvinceName("SamutSongkhram"); }
				else if(provinceId == 60L){ newProvince.setProvinceName("Saraburi"); }
				else if(provinceId == 61L){ newProvince.setProvinceName("Satun"); }
				else if(provinceId == 62L){ newProvince.setProvinceName("SingBuri"); }
				else if(provinceId == 63L){ newProvince.setProvinceName("Sisaket"); }
				else if(provinceId == 64L){ newProvince.setProvinceName("Songkhla"); }
				else if(provinceId == 65L){ newProvince.setProvinceName("Songkhla"); }
				else if(provinceId == 66L){ newProvince.setProvinceName("SuphanBuri"); }
				else if(provinceId == 67L){ newProvince.setProvinceName("SuratThani"); }
				else if(provinceId == 68L){ newProvince.setProvinceName("Surin"); }
				else if(provinceId == 69L){ newProvince.setProvinceName("Tak"); }
				else if(provinceId == 70L){ newProvince.setProvinceName("Trang"); }
				else if(provinceId == 71L){ newProvince.setProvinceName("Trat"); }
				else if(provinceId == 72L){ newProvince.setProvinceName("UbonRatchathani"); }
				else if(provinceId == 73L){ newProvince.setProvinceName("UdonThani"); }
				else if(provinceId == 74L){ newProvince.setProvinceName("UthaiThani"); }
				else if(provinceId == 75L){ newProvince.setProvinceName("Uttaradit"); }
				else if(provinceId == 76L){ newProvince.setProvinceName("Yala"); }
				else if(provinceId == 77L){ newProvince.setProvinceName("Yasothon"); }
				provinceRepository.save(newProvince);
			});
		};
	}

}

