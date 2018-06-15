`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date:    20:09:37 04/03/2018 
// Design Name: 
// Module Name:    v74x139h_c 
// Project Name: 
// Target Devices: 
// Tool versions: 
// Description: 
//
// Dependencies: 
//
// Revision: 
// Revision 0.01 - File Created
// Additional Comments: 
//
//////////////////////////////////////////////////////////////////////////////////
module v74x139h_c(
    input G,
    input A,
    input B,
    output [3:0] Y
    );
	 
	 wire [1:0] sel;
	 reg [3:0] out;
	 
	 assign sel = {B, A};
	 assign Y = ~out;
	 
	 always@(G or sel)
		begin
			if (G == 1'b0)
				begin
					case(sel)
						2'b00 : out = 4'b0001;
						2'b01 : out = 4'b0010;
						2'b10 : out = 4'b0100;
						2'b11 : out = 4'b1000;
					endcase
				end
			else
				begin
					out = 4'b0000;
				end
			end
	
endmodule
