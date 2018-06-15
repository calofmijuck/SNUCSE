// Verilog test fixture created from schematic /csehome/calofmijuck/Desktop/Comparator/comparator_eq.sch - Tue Mar 27 19:35:52 2018

`timescale 1ns / 10ps

module comparator_comparator_sch_tb();

// Inputs
	reg in1;
	reg in2;
	reg in3;
	reg in4;

// Output
	wire out1;

// Bidirs

// Instantiate the UUT
   comparator UUT (
		.in1(in1),
		.in2(in2),
		.in3(in3),
		.in4(in4),
		.out1(out1)
   );
// Initialize Inputs
			initial begin
			in1 = 0;
			in2 = 0;
			in3 = 0;
			in4 = 0;
			#100;
			
			in1 = 0;
			in2 = 0;
			in3 = 0;
			in4 = 1;
			#100;
			
			in1 = 0;
			in2 = 0;
			in3 = 1;
			in4 = 0;
			#100;
			
			in1 = 0;
			in2 = 0;
			in3 = 1;
			in4 = 1;
			#100;
			
			in1 = 0;
			in2 = 1;
			in3 = 0;
			in4 = 0;
			#100;
			
			in1 = 0;
			in2 = 1;
			in3 = 0;
			in4 = 1;
			#100;
			
			in1 = 0;
			in2 = 1;
			in3 = 1;
			in4 = 0;
			#100;
			
			in1 = 0;
			in2 = 1;
			in3 = 1;
			in4 = 1;
			#100;
			
			in1 = 1;
			in2 = 0;
			in3 = 0;
			in4 = 0;
			#100;
			
			in1 = 1;
			in2 = 0;
			in3 = 0;
			in4 = 1;
			#100;
			
			in1 = 1;
			in2 = 0;
			in3 = 1;
			in4 = 0;
			#100;
			
			in1 = 1;
			in2 = 0;
			in3 = 1;
			in4 = 1;
			#100;
			
			in1 = 1;
			in2 = 1;
			in3 = 0;
			in4 = 0;
			#100;
			
			in1 = 1;
			in2 = 1;
			in3 = 0;
			in4 = 1;
			#100;
			
			in1 = 1;
			in2 = 1;
			in3 = 1;
			in4 = 0;
			#100;
			
			in1 = 1;
			in2 = 1;
			in3 = 1;
			in4 = 1;
			#100;
		end
endmodule
