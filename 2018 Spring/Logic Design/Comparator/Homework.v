// Verilog test fixture created from schematic /csehome/calofmijuck/Desktop/Comparator/comparator.sch - Tue Mar 27 20:25:57 2018

`timescale 1ns / 1ps

module comparator_comparator_sch_tb();

// Inputs
   reg in3;
   reg in4;
   reg in1;
   reg in2;

// Output
   wire out1;

// Bidirs

// Instantiate the UUT
   comparator UUT (
		.in3(in3), 
		.in4(in4), 
		.in1(in1), 
		.in2(in2), 
		.out1(out1)
   );
// Initialize Inputs
   `ifdef auto_init
       initial begin
		in3 = 0;
		in4 = 0;
		in1 = 0;
		in2 = 0;
   `endif
endmodule
