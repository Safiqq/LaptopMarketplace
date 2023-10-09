package com.example.laptopmarketplace

object LaptopsData {
	private val laptopNames = arrayOf(
		"Razer Blade 15",
		"Asus ROG Zephyrus G14",
		"Razer Blade 14",
		"Lenovo Legion 5 Pro",
		"MSI Stealth GS66",
		"Acer Predator Helios 300",
		"Asus ROG Strix Scar 17",
		"Alienware M15",
		"MSI Raider GE76",
		"Acer Predator Triton 500"
	)

	private val laptopDetails = arrayOf(
		"The latest spin of the Razer Blade 15 once again improves on one of the best gaming laptops ever made. It has the same gorgeous CNC-milled aluminum chassis as its predecessor, only this time it can house one of Nvidia's latest RTX 30-series GPUs and an Intel 12th Gen Core i9 CPU. The Blade 15 isn't the lightest gaming laptop you can buy, but five pounds is still way better than plenty of traditional gaming laptops, while also offering similar performance and specs. That heft helps make it feel solid too. It also means the Blade 15 travels well in your backpack. An excellent choice for the gamer on the go... or if you don't have the real estate for a full-blown gaming desktop and monitor.",
		"The new version of the Zephyrus G14 for 2022 impresses us once again with its well-balanced spec and excellent gaming performance. Seriously, this thing shreds through frames up to its 120Hz refresh rate, and it's great for much more than gaming, too. At its heart is the AMD Ryzen 6900HS. That's one of the top chips from AMD's Ryzen 6000-series, but not its best and brightest—though you're really fighting over boost clocks and not much else when it comes to the tippy top of the red team's mobile processors anyways. It delivers eight cores and 16 threads of the Zen 3+ architecture, capable of boosting to 4.9GHz (which it actually does on occasion), so that's more than acceptable by me.",
		"The Razer style is classic, and it feels great to hold, too. And with the outstanding AMD Ryzen 9 5900HX finally finding its way into a Blade notebook, you're getting genuine processing power you can sling into a messenger bag. And you're now able to get your hands on the Blade 14 with the brand new Ryzen 9 6900HX chip at its heart, though in practice that has changed very little apart from offering some decent integrated graphics. But add in some extra Nvidia RTX 30-series graphics power—now all the way up to an RTX 3080 Ti, but wear earplugs—and you've got a great mix of form and function that makes it the most desirable laptop I've maybe ever tested. ",
		"The Legion Pro 5 proves that AMD is absolutely a serious competitor in the gaming laptop space. Pairing the mobile Ryzen 7 5800H with the RTX 3070 results in a laptop that not only handles modern games with ease, but that can turn its hand at more serious escapades too. The QHD 16:10 165Hz screen is a genuine highlight here and one that makes gaming and just using Windows a joy. It's an IPS panel with a peak brightness of 500nits too, so you're not going to be left wanting whether you're gaming or watching movies.",
		"The MSI GS66 is one hell of a machine: It's sleek, slick, and powerful. But it's not Nvidia Ampere's power without compromise, however. MSI has had to be a little parsimonious about its power demands to pack something as performant as an RTX 3080 into an 18mm thin chassis. The top GPU is the 95W version, which means it only just outperforms a fully unleashed RTX 3070, the sort you'll find in the Gigabyte Aorus 15G XC. But it is still an astonishingly powerful slice of mobile graphics silicon.",
		"The newest version of the Helios packs an RTX 3060 GPU and a sleeker form factor without raising the price significantly. It also has a 144Hz screen and smaller bezels, putting it more in line with sleek thin-and-lights than its more bulky brethren of the previous generation. The only real drawback is the diminutive SSD, although the laptop has slots for two SSDs and an HDD, which makes upgrading your storage as easy as getting a screwdriver. You often need to get handy with the upgrades at this end of the price spectrum, and the Helios 300 is no different in that respect.",
		"The 17-inch chassis means the components have a bit more room to breathe compared to the competition too, and coupled with the excellent cooling system, you're looking at a cool and quiet slice of gaming perfection. This extra space has allowed Asus to squeeze an optomechanical keyboard onto the Scar 17, which is a delight for gaming and more serious pursuits. Importantly, all this power comes at a cost not only to the temperatures but also to the battery life. Sure, you're not as likely to play games with the thing unplugged, but if you ever have to, an hour is all you get.",
		"The Alienware M15 R4 is a sleek and functional gaming laptop, powered by an impressive Nvidia GeForce RTX 3070 GPU. While this machine can easily run you \$2,500 (or more), in return, you'll get a streamlined and relatively lightweight device with a slick white chassis and an RGB keyboard. With a fast CPU, lots of hard drive space and a surprisingly good touchpad, the m15 R4 is a suitable tool for both work and play. This machine can run the latest games at demanding settings, and thanks to its cutting-edge hardware, it's sure to last you for years to come.",
		"The GE76 Raider is, objectively, the definition of top-of-the-line, eschewing portability and battery life to deliver raw, uncompromising power for a very particular niche. You’d be hard pressed to find more performance in a package you can technically take with you, and when paired with a monitor this machine is a desktop replacement that truly lives up to the name. The Raider's 1080p display looks nice and can run games remarkably smoothly thanks to its 360Hz refresh rate, but it's probably best used primarily plugged into a nicer TV or monitor.",
		"If you're looking for a premium gaming laptop with great performance — and an especially killer display — the Acer Predator Triton 500 is an excellent choice. The latest Triton 500 stands out with its 15.6-inch 1080p screen, which not only looks great, but packs a blistering 300Hz refresh rate for playing the top PC games at the fastest framerates possible. The laptop's Nvidia GeForce RTX 2080 Super GPU can handle the latest AAA titles at high graphical settings, and its 10th Gen Core i7 CPU blows through everyday productivity tasks with ease. There's also its elegant black design, which packs in plenty of ports for connecting peripherals and external monitors."
	)

	private val laptopCpus = arrayOf(
		"Intel Core i9 12900H",
		"AMD Ryzen 9 6900HS",
		"AMD Ryzen 9 6900HX",
		"AMD Ryzen 7 5800H",
		"Intel Core i9 12900H",
		"Intel Core i7 12700H",
		"Intel Core i9 12900H",
		"Intel Core i7 10870H",
		"Intel Core i9 11980HK",
		"Intel Core i7 10750H"
	)

	private val laptopGpus = arrayOf(
		"Nvidia RTX 3080 Ti",
		"AMD Radeon RX 6800S",
		"Nvidia RTX 3080 Ti",
		"Nvidia RTX 3070",
		"Nvidia RTX 3080 Ti",
		"Nvidia RTX 3080",
		"Nvidia RTX 3080 Ti",
		"Nvidia RTX 3070",
		"Nvidia RTX 3080",
		"Nvidia RTX 2080 Super"
	)

	private val laptopRams = arrayOf(
		"32GB DDR5",
		"32GB DDR5-4800",
		"16GB DDR5-4800",
		"32GB DDR4",
		"32GB DDR5-4800",
		"32GB DDR5-4800",
		"32GB DDR5-4800",
		"16GB DDR5",
		"32GB DDR4",
		"32GB DDR4"
	)

	private val laptopScreens = arrayOf(
		"1080p @ 360Hz",
		"1600p @ 120Hz",
		"1440p @ 165Hz",
		"1600p @ 165Hz",
		"1080p @ 300Hz",
		"1080p @ 240Hz",
		"1440p @ 240Hz",
		"1080p @ 300Hz",
		"1080p @ 144Hz",
		"1080p @ 300Hz"
	)

	private val laptopStorages = arrayOf(
		"1TB SSD",
		"1TB SSD",
		"1TB SSD",
		"2TB SSD",
		"2TB SSD",
		"1TB SSD",
		"2TB SSD",
		"1TB SSD",
		"1TB SSD",
		"1TB SSD"
	)

	private val laptopBatteries = arrayOf(
		"80Wh",
		"76Wh",
		"61.6Wh",
		"86Wh",
		"99.9Wh",
		"58Wh",
		"90Wh",
		"86Wh",
		"99.9Wh",
		"82Wh"
	)

	private val laptopDimensions = arrayOf(
		"13.98 x 9.25 x 0.78 inches",
		"12.28 x 8.94 x 0.73 inches",
		"12.59 x 8.66 x 0.66 inches",
		"14.01 x 10.4 x 1.1 inches",
		"14.1 x 9.76 x 0.77 inches",
		"14.23 x 10.01 x 0.9 inches",
		"15.55 x 11.1 x 0.92 inches",
		"14.19 x 10.86 x 0.78 inches",
		"15.63 x 10.57 x 1.08 inches",
		"14.11 x 10.04 x 0.7 inches"
	)

	private val laptopWeights = arrayOf(
		"4.63lbs",
		"3.79lbs",
		"3.92lbs",
		"5.4lbs",
		"4.63lbs",
		"5.51lbs",
		"6.39lbs",
		"5.3lbs",
		"6.4lbs",
		"4.6lbs"
	)

	private val laptopPrices = arrayOf(
		"$3,699.08",
		"$2,309.00",
		"$3,499.99",
		"$1,861.00",
		"$3,999.00",
		"$1,799.99",
		"$2,714.99",
		"$1,999.99",
		"$1,542.98",
		"$1,419.88"
	)

	private val laptopPhotos = arrayOf(
		R.drawable.razer_blade_15,
		R.drawable.asus_rog_zephyrus_g14,
		R.drawable.razer_blade_14,
		R.drawable.lenovo_legion_5_pro,
		R.drawable.msi_stealth_gs66,
		R.drawable.acer_predator_helios_300,
		R.drawable.asus_rog_strix_scar_17,
		R.drawable.alienware_m15_r4,
		R.drawable.msi_raider_ge76,
		R.drawable.acer_predator_triton_500
	)

	val listData: ArrayList<Laptop>
		get() {
			val list = arrayListOf<Laptop>()
			for (position in laptopNames.indices) {
				val laptop = Laptop()
				laptop.name = laptopNames[position]
				laptop.detail = laptopDetails[position]
				laptop.cpu = laptopCpus[position]
				laptop.gpu = laptopGpus[position]
				laptop.ram = laptopRams[position]
				laptop.screen = laptopScreens[position]
				laptop.storage = laptopStorages[position]
				laptop.battery = laptopBatteries[position]
				laptop.dimensions = laptopDimensions[position]
				laptop.weight = laptopWeights[position]
				laptop.price = laptopPrices[position]
				laptop.photo = laptopPhotos[position]
				list.add(laptop)
			}
			return list
		}
}