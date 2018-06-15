`timescale 1ns / 1ps

////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer:
//
// Create Date:   20:05:39 04/03/2018
// Design Name:   v74x139_b
// Module Name:   /csehome/calofmijuck/Desktop/v74x139/v74x139_b_test.v
// Project Name:  v74x139
// Target Device:  
// Tool versions:  
// Description: 
//
// Verilog Test Fixture created by ISE for module: v74x139_b
//
// Dependencies:
// 
// Revision:
// Revision 0.01 - File Created
// Additional Comments:
// 
////////////////////////////////////////////////////////////////////////////////

module v74x139_b_test;

	// Inputs
	reg G;
	reg A;
	reg B;

	// Outputs
	wire [3:0] Y;

	// Instantiate the Unit Under Test (UUT)
	v74x139_b uut (
		.G(G), 
		.A(A), 
		.B(B), 
		.Y(Y)
	);

	initial begin
		// Initialize Inputs
		G = 0;
		A = 0;
		B = 0;
		#100;
      
		G = 0;
		A = 0;
		B = 1;
		#100;
		
		G = 0;
		A = 1;
		B = 0;
		#100;
		
		G = 0;
		A = 1;
		B = 1;
		#100;
		
		G = 1;
		A = 0;
		B = 0;
		#100;
		
		G = 1;
		A = 0;
		B = 1;
		#100;
		
		G = 1;
		A = 1;
		B = 0;
		#100;
		
		G = 1;
		A = 1;
		B = 1;
		#100;
		// Add stimulus here

	end
      
endmodule

