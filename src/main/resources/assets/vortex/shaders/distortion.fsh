#version 150

uniform sampler2D DiffuseSampler;
uniform float distortionStrength;
uniform float greenTint;

in vec2 uv;
out vec4 fragColor;

void main() {
    vec2 center = vec2(0.5, 0.5);
    vec2 coord = uv;
    
    // Calculate distance from center
    float dist = distance(coord, center);
    
    // Apply distortion that increases towards edges
    vec2 offset = normalize(coord - center) * pow(dist, 2.0) * distortionStrength;
    vec2 distortedUV = uv + offset;
    
    // Sample color with distortion
    vec4 color = texture(DiffuseSampler, distortedUV);
    
    // Apply green tint that increases towards edges
    float edgeFactor = smoothstep(0.3, 0.7, dist);
    color.rgb = mix(color.rgb, vec3(0.0, greenTint, 0.0), edgeFactor * 0.5);
    
    fragColor = color;
}